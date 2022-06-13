import java.io.*;

public class ColyLine {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        try {
        String line;
        while((line = in.readLine()) != null){
            out.println(line);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
