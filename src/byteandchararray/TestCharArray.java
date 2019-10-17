package byteandchararray;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.Reader;
import java.io.Writer;

public class TestCharArray {

    public static void main(String[] args) throws Exception{

        Reader reader = new CharArrayReader("你好,world".toCharArray());

        int a = reader.read();

        while (a != -1){
            System.out.print((char) a);
            a = reader.read();
        }

        System.out.println("\n=========================");
        Writer writer = new CharArrayWriter();
        writer.write("你好");
        writer.append("哈哈哈");

        char[] b = ((CharArrayWriter) writer).toCharArray();

        System.out.println(new String(b));
    }
}
