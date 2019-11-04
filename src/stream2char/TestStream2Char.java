package stream2char;

import java.io.*;

public class TestStream2Char {

    public static void main(String[] args) throws Exception{

        InputStream inputStream = new FileInputStream("E://out.txt");

        Reader reader = new InputStreamReader(inputStream);

        char[] chars = new char[1024];

        reader.read(chars);

        System.out.println(new String(chars));
        int c = reader.read();

//        while (c != -1){
//            System.out.print(c);
//            c = reader.read();
//        }

    }
}
