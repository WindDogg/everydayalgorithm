package com.jvm;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/8 15:47
 */
public class StringIntern {

    public static void main(String[] args) {
       /* String s = new StringBuilder("1").toString();
        s.intern();
        String s2 = "1";
        System.out.println(s==s2);*/

        String s3 = new String("1")+new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3==s4);
    }
}
