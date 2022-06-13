import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CFileAddLine {
    public static void main(String args[]) throws IOException{
        File directoryPath = new File("/Users/gongzalez/Documents/java/java-prac-GUI");
        File filesList[] = directoryPath.listFiles();

        Scanner sc = null;
        for (File file : filesList){
            System.out.println("파일이름: "+file.getName());
            System.out.println("파일경로: "+file.getAbsolutePath());
            System.out.println("파일크기: "+file.getTotalSpace());

            sc = new Scanner(file);
            String input;
            StringBuffer sb = new StringBuffer();

            sb.append("#define _CRT_SECURE_NO_WARNINGS\n");
            while(sc.hasNextLine()){
                input = sc.nextLine();
                sb.append(input+"\n");
            }
            String oldName = file.getAbsolutePath();
            String fileName;
            if (oldName.indexOf(".")>0)
                fileName = oldName.substring(0,oldName.lastIndexOf("."));
            else
                fileName = oldName;

            System.out.println(fileName);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName +"1.c"));
            writer.write(sb.toString());
            writer.close();
        }
    }
}
