package com.jhl.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;

/**
 *
 */
public class commonTmpUtils {
    public Object exctpton(int a) {
        return null;
    }

    /**
     * @Description 生成随机数字
     * @Author jhl
     * @Date 2020/12/27 22:27
     * @Version 1.0
     */
    public static String genRadomNumber(int length) {
        StringBuffer bf = new StringBuffer();
        if (length <= 0) {
            return "";
        }
        DecimalFormat df = new DecimalFormat("###");//把科学计数法格式化为正常数字
        double random = Math.random() * 1E16;
        bf.append(df.format(random));
        int calculate = length;
        while (calculate - 16 > 0) {
            calculate = calculate - 16;
            random = Math.random() * 1E16;
            bf.append(df.format(random));
        }
        String doubleStr = bf.toString().substring(0, length);
        return doubleStr;
    }

    /**
     * @Description 生成随机汉字，方法实现来自网络
     * @Author jhl
     * @Date 2020/12/27 22:45
     * @Version 1.0
     */
    public static String genChineseCharacter() {
        Random r = new Random();
        StringBuffer name = new StringBuffer();
        for (int j = 0; j < 2; j++) {
            Integer a = r.nextInt(39) + 176;
            Integer b = r.nextInt(93) + 161;
            byte[] arr = {a.byteValue(), b.byteValue()};
            try {
                name = name.append(new String(arr, "GBK"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return name.toString();
    }

    public static String genName() {
        String[] xiangArray = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "诸", "卫", "蒋", "沈", "韩", "杨", "朱", "秦",
                "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水",
                "窦", "章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任",
                "袁", "柳", "酆", "鲍", "史", "唐", "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬",
                "安", "常", "乐", "于", "时", "傅", "皮", "卡", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆",
                "萧", "贾"};
        Random r = new Random();
        String xiang = xiangArray[r.nextInt(100)];
        String name = xiang + commonTmpUtils.genChineseCharacter();
        return name;
    }
/**
 * @Description 随机获取Map的key
 * @Author jhl
 * @Date 2021/1/1 9:58
 * @Version 1.0
 */
    public  static String getMapRandomKey(Map<String , String> map){
        Object[] objects = map.keySet().toArray();
        Random random = new Random();
        Object object = objects[random.nextInt(objects.length - 1)];
        return (String) object;
    }
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(commonTmpUtils.genName());

    }
}
