package buffered;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestBufferedStream {

    public static void main(String[] args) throws Exception{

        byte[] bytes = new byte[1024];

        InputStream inputStream = new FileInputStream("E://out.txt");

        inputStream.read(bytes);

//        InputStream in = new BufferedInputStream(inputStream);
        int a = Byte.MAX_VALUE;
        int b = Byte.MIN_VALUE;
        byte c = 127;



    }
}
