package system;

import java.io.PrintStream;

public class TestSystem {

    public static void main(String[] args) throws Exception{

        PrintStream outputStream = new PrintStream("E:\\out.txt");
        System.setOut(outputStream);

        System.out.println("哈哈哈，嘻嘻嘻");
        System.out.append("啦啦啦啦啦啦啦啦啦啦啦");



    }
}
