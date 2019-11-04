package random;

import java.io.RandomAccessFile;

public class TestRandom {

    public static void main(String[] args){

        try(RandomAccessFile file = new RandomAccessFile("E://random.txt","rw");){
            file.write("hello,world".getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
