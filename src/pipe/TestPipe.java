package pipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Java IO中的管道为运行在同一个JVM中的两个线程提供了通信的能力。所以管道也可以作为数据源以及目标媒介。
 * 你不能利用管道与不同的JVM中的线程通信(不同的进程)。在概念上，Java的管道不同于Unix/Linux系统中的管道。
 * 在Unix/Linux中，运行在不同地址空间的两个进程可以通过管道通信。在Java中，通信的双方应该是运行在同一进程中的不同线程。
 *
 *
 *
 */


public class TestPipe {

    public static void main(String[] args) throws Exception{

        final PipedInputStream inputStream = new PipedInputStream();
        final PipedOutputStream outputStream = new PipedOutputStream(inputStream);

        Runnable inTask = ()->{
            try {
                int data = inputStream.read();
                while (data != -1){
                    System.out.print((char) data);
                    data = inputStream.read();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Runnable outTask = ()->{

            while (true){
                try {
                    Thread.sleep(1500);
                    outputStream.write("hello,world".getBytes());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(inTask);
        service.submit(outTask);

    }

}
