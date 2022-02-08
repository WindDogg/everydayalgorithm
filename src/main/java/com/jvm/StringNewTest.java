package com.jvm;

/**
 * @author xhj
 * @version JVM
 * @Date 2022/2/8 15:40
 */
public class StringNewTest {

    public static void main(String[] args) {
        String str0 = "ab";
        String str = new String("ab");

        /*String str2 =  new String("a")+new String("b");*/
        System.out.println(str==str0);


    }
}
