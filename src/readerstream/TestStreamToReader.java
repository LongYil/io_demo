package readerstream;

import javax.print.DocFlavor;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestStreamToReader {

    public static void main(String[] args) throws Exception{

        PipedInputStream in = new PipedInputStream();

        PipedOutputStream out = new PipedOutputStream(in);

        ExecutorService service = Executors.newFixedThreadPool(2);

        Runnable readTask = ()->{
            Reader reader = new InputStreamReader(in);

            char[] chars = new char[1024];

            try {
                reader.read(chars);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(chars.toString());
        };

        Runnable writeTask = ()->{
            try {
                out.write("你好，世界！hello,world!".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        };



    }
}
