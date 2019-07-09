package cn.myfreecloud.chapter01.simulation;

/**
 * @author: zhangyang
 * @date: 2019/7/4 11:27
 * @description: scala在运行时进行了包装 模拟scala的运行流程
 */
public class TestScala {

    public static void main(String[] paramArrayOfString)
    {
        TestScala$.MODULE$.main(paramArrayOfString);
    }

}

final class TestScala$ {
    public static final  TestScala$ MODULE$;

    static {
        MODULE$ = new TestScala$();
    }

    public void main(String[] args) {
       System.out.println("hello world");
    }
}

