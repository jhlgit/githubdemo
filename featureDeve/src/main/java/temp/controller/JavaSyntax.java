package temp.controller;


import temp.dto.Car;

public class JavaSyntax {
    public void tempFunction() {
        float f = 3.499F;
        String a = "sfsfadsf";
        a.length();
        char c = '含';
    }

    public static void main(String[] args) {
        System.out.println("abcd".length());
        Car car = new Car();
        System.out.println(car.hashCode());
        car.setBrand("vvv");
        String str1 = new String("aa2aa");
        String str2 = new String("aa2aa");
        System.out.println(str1 == str2);

    }
}
