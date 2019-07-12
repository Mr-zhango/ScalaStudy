package cn.myfreecloud.chapter05.myexception;

import java.security.Principal;

public class JavaExceptionDemo01 {
    public static void main(String[] args) {
        try {
            // 可疑代码
            int i = 0;
            int b = 10;
            int c = b / i; // 执行代码时，会抛出ArithmeticException异常
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出了异常");
        } finally {
            // 最终要执行的代码
            System.out.println("java finally");
        }


        System.out.println("继续执行后续的代码..........");

    }
}
