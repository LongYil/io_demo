package systeminandout;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestIn {

    public static void main(String[] args) throws Exception{

        int a = System.in.read();
        OutputStream out = new FileOutputStream("E:\\out.txt");
        while (a != -1){
            System.err.print((char) a);
            out.write(a);
            a = System.in.read();
        }
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()){
//            System.out.println(new Date() + ":" + scanner.next());
//        }
    }

}