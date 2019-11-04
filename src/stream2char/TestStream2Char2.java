package stream2char;

import java.io.*;

public class TestStream2Char2 {

    public static void main(String[] args){

        try (OutputStream outputStream = new FileOutputStream("E://out2.txt")){
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write("哈哈哈哈哈");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("E://in.txt"));
            OutputStream outputStream = new FileOutputStream("E://out.txt")){


        }catch (Exception e){
            e.printStackTrace();
        }

        try(Reader reader = new BufferedReader(new FileReader("E://in2.txt"))){
            reader.read();
        }catch (Exception e){
            e.printStackTrace();
        }

        try(OutputStream outputStream = new FileOutputStream("E://test.txt",true);){
            outputStream.write("嘿嘿嘿".getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
