package IO.read;
import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public void readText() {
        try {
            FileInputStream fs = new FileInputStream("./src/IO/read/in.txt");
            FileOutputStream fo = new FileOutputStream("./src/IO/read/write.txt");
            int c;
            while( (c = fs.read()) != -1 ){
                fo.write(c);
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readLine() {
        try{
            BufferedReader bf = new BufferedReader(new FileReader("./src/IO/read/in.txt"));
            String line;
            while( (line = bf.readLine()) != null){
                System.out.println(line);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void scanText() {
        try{
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("./src/IO/read/in.txt")));
            String line;
            while( scanner.hasNext() ){
                if(scanner.hasNextDouble())
                    System.out.println(scanner.nextDouble());
                else scanner.next();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadWrite read = new ReadWrite();
//      read.readText();
//        read.readLine();
        read.scanText();
    }
}
