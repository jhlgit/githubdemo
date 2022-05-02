package com.jhl.practice;

import com.jhl.base.LogWriter;

import java.math.BigDecimal;

/**
 * @Description
 * @Author jhl
 * @Date 2022/5/2 15:12
 * @Version 1.0
 */
public class Holder {
    private int n;
    public Holder (int n,String threadid){
        long start=System.currentTimeMillis();
        LogWriter.info(this.getClass(),"Holder开始时间"+start);
        this.n=n;
        BigDecimal  tmp=new BigDecimal("5");
        for (int i =0;i<10;i++){
            tmp=tmp.multiply(tmp.add(new BigDecimal(i)));
        }
        long end=System.currentTimeMillis();
//        LogWriter.info(this.getClass(),"用时:"+ String .valueOf(end-start)+",Holder的tmp值："+tmp);
    }
    public void assertSanity(String threadid) throws Exception{
        if (n !=n){
            throw new Exception("this statement is false");
        }
        LogWriter.info(this.getClass(),"assertSanity："+threadid);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
