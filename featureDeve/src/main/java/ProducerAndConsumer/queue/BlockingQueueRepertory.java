package ProducerAndConsumer.queue;

import ProducerAndConsumer.common.PCData;
import ProducerAndConsumer.common.ToolUtil;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2019/3/28.
 */
public class BlockingQueueRepertory {
    // 仓库最大存储量
    private final int MAX_SIZE = 10;
    private LinkedBlockingQueue<PCData> list = new LinkedBlockingQueue<PCData>(MAX_SIZE);
    private String listsize = "listsize";

    // 生产产品
    public void producer(String roleName) {
        while (true) {
            synchronized (listsize) {
                if (list.size() == MAX_SIZE) {
                    System.out.println(roleName + Thread.currentThread().getName() + "仓库已满" + ",库存:" + list.size());
                }
                ToolUtil toolUtil = new ToolUtil();
                PCData pCData = new PCData();
                pCData.setId(toolUtil.getNum());
                try {
                    list.put(pCData);
                    System.out.println(roleName + Thread.currentThread().getName() + "生产" + pCData.getId() + "之后" + ",库存:" + list.size() + "," + list.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 消费产品
    public void consumer(String roleName) {
        while (true) {
            synchronized (listsize) {
                if (list.size() <= 0) {
                    System.out.println("\t" + roleName + Thread.currentThread().getName() + "空" + ",库存:" + list.size());
                }
                try {
                    PCData pcData = list.take();
                    System.out.println("\t" + roleName + Thread.currentThread().getName() + "消费" + pcData.getId() + "之后" + ",库存:" + list.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        final BlockingQueueRepertory blockingQueueRepertory = new BlockingQueueRepertory();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                public void run() {
                    blockingQueueRepertory.producer("生产者");

                }
            }).start();
        }
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                public void run() {
                    blockingQueueRepertory.consumer("消费者");
                }
            }).start();
        }

        System.out.println("end");
    }


}
