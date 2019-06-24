/**
 * @description 
 * @author jhl
 * @create Dec 4, 2018
 */
package com.jhl.temp.function;

/**
 * @description 
 * @author jhl
 * @create Dec 4, 2018 11:25:51 PM
 */
public class LiftOff implements Runnable{

    protected int countDown=10;
    protected int l=0;
    /**
     * @description 
     * @author jhl
     * @create Dec 4, 201811:26:17 PM
     */
    private String status(){
        return Thread.currentThread().getId()+"#"+"("+countDown+")";
    }
    public void run() {
        // TODO Auto-generated method stub
        while (countDown -- > 0) {
            System.out.println(status());
        try {
            System.out.println("           sleep");
            Thread.sleep(1000);
            Thread.yield();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        };
    }
public static void main(String[] args) {
    System.out.println("mainid:#"+Thread.currentThread().getId());
    for (int i = 0;  i< 50; i++) {
        new Thread(new LiftOff()).start();
        System.out.println(i+"======");
    }
//    LiftOff liftOff=new LiftOff();
//    liftOff.run();
}
}
