package data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestData {

    public static void main(String[] args){


//        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("E://data.data"));){

//            dataOutputStream.writeBoolean(true);
//            dataOutputStream.writeBoolean(false);

//            dataOutputStream.write(123);
//            dataOutputStream.write(1150);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("E://data.data"));){

//            System.out.println("boolean:" + dataInputStream.readBoolean());
//            System.out.println("boolean:" + dataInputStream.readBoolean());
            System.out.println("int:" + dataInputStream.readInt());
            System.out.println("int:" + dataInputStream.readInt());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
