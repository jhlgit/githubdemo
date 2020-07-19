package com.jhl.entity;

import org.springframework.core.convert.converter.Converter;

public class InnerClazz {
    class Contents{};
    public  Contents contents(){
        return new  Contents(){
            private int i=11;
            public int value( ){return i;};
        };
    }

    public static void main(String[] args) {
        InnerClazz innerClazz = new InnerClazz();
        Contents c= innerClazz.contents();
        Converter<String,Integer> cs =new Converter<String, Integer>() {
            @Override
            public Integer convert(String source) {
                return null;
            }
        };

        Converter<String,Integer> c1= (f) ->{
            return  Integer.valueOf(f);
        };

    }
}
