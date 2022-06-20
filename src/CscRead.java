import java.io.BufferedReader;
import java.io.FileReader;

public class CscRead {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("test.csv"));
        String row;

        while  ((row = reader.readLine())!=null){
            String[] data = row.split(",");
            System.out.println(data[0]);

        }

        reader.close();

    }
}
