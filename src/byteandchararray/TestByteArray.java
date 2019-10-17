package byteandchararray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestByteArray {

    public static void main(String[] args) throws Exception{

        InputStream inputStream = new ByteArrayInputStream("hello,world".getBytes());

        int a = inputStream.read();

        while (a != -1){
            System.out.print((char) a);
            a = inputStream.read();
        }

        System.out.println("\n=========================================");
        OutputStream outputStream = new ByteArrayOutputStream();

        outputStream.write("hello,world".getBytes());

        outputStream.write("I am work.".getBytes());

        byte[] bytes = ((ByteArrayOutputStream) outputStream).toByteArray();

        System.out.println(new String(bytes));
    }
}
