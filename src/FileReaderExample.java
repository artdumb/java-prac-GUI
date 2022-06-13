import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String args[]){
        FileReader fr;
        try{
            fr = new FileReader("test.txt");
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char) ch+" ");
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
