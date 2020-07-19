/**
 * @description 
 * @author jhl
 * @create Nov 25, 20188:51:04 PM
 */
package com.jhl.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


/**
 * @description 
 * @author jhl
 * @create Nov 25, 2018 8:54:21 PM
 */
public class ObjectWaitTest1 {
private int count=10;
    public static void main(String[] args) throws InterruptedException {
        ObjectWaitTest1 objectWaitTest1=new ObjectWaitTest1();
        objectWaitTest1.foreach();
    }
    public void updatecount(){
        count++;
        System.out.println(Thread.currentThread().getName()+":"+count);
    }
    public void foreach () throws InterruptedException{
        ObjectWaitTest1 objectWaitTest1=new ObjectWaitTest1();
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread();
            Thread t1 = new Thread(t,"t1");
            Thread t2 = new Thread(t,"t1");
            t1.start();
            t2.start();
            System.out.println(i+",ThreadName:"+Thread.currentThread().getId()+"sleep,start");
            synchronized (this) {
                t.wait(1000);
            }
//            t.notify();
//            t.sleep(1000*2);
            System.out.println(i+",ThreadName:"+Thread.currentThread().getId()+"sleep,stop");
            System.out.println("\r\n");
            objectWaitTest1.updatecount();
        };
    }
    public void RunTest(){
        synchronized (this) {
            count++;
        }
        ThreadFrdomRun3 threadFromRun=new ThreadFrdomRun3();
    }
    public void file(String pathname) throws Exception{
        File file =new File(pathname);
        InputStream inputStream=new FileInputStream(file);
//        ByteBuffer ByteBuffer=new ByteBuffer();
    }
}
