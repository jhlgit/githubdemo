package ProducerAndConsumer.queue;

import ProducerAndConsumer.common.PCData;
import ProducerAndConsumer.common.ToolUtil;

import java.util.LinkedList;

/**
 * Created by Administrator on 2019/3/27.
 */
public  class Repertory {
    private static final String STG="Repertory";
    private static final int MAX_LEN=10;
    private LinkedList<PCData> list=new LinkedList<PCData>();

    public   void  producer (String roleName){

        synchronized (list) {
            while (true) {
                while (list.size() == MAX_LEN) {
                    try {
                        System.out.println(roleName + Thread.currentThread().getName() + "队列已满"+",库存:"+list.size());
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                PCData pCData = new PCData();
                pCData.setId(ToolUtil.getToolUtil().getNum());
                list.add(pCData);
                System.out.println(roleName + Thread.currentThread().getName() + "生产"+pCData.getId()+"之后"+",库存:"+list.size()+","+list.toString());
                list.notifyAll();
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void  consumer(String roleName){
        while (true) {
            synchronized (list) {

                while (list.size() == 0) {
                    try {
                        System.out.println("\t"+roleName + Thread.currentThread().getName() + "空了");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                PCData pcData= list.removeFirst();
                System.out.println("\t" + roleName + Thread.currentThread().getName() + "消费"+pcData.getId()+"之后"+",库存:"+list.size()+","+list.toString());
                try {
                    System.out.println(Thread.currentThread().getName()+"线程挂起");
                    Thread.sleep(((long) (Math.random() * 1000)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.notifyAll();
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        ToolUtil toolUtil=new ToolUtil();
        final Repertory repertory=new Repertory();
        for (int i = 0; i <10 ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    repertory.producer("生产者");
                }
            }).start();
        };
        for (int i = 0; i <3 ; i++) {
            new Thread(new Runnable() {
                public void run() {
                    repertory.consumer("消费者");
                }
            }).start();
        };
        System.out.println("end");
    }
}