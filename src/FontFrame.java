import javax.swing.*;
import java.awt.*;

public class FontFrame extends JPanel {

    Font f1,f2,f3,f4,f5;

    public FontFrame(){
        f1 = new Font("Serif",Font.PLAIN,20);
        f2 = new Font("San Serif",Font.BOLD,20);
        f3 = new Font("Monospaced",Font.ITALIC,20);
        f4 = new Font("Dialog",Font.BOLD | Font.ITALIC,20);
        f5 = new Font("DialogInput",Font.BOLD,20);
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setFont(f1);
        g.drawString("Serif 20p PLAIN",10,50);
        g.setFont(f2);
        g.drawString("SanSerif 20p BOLD",10,70);
        g.setFont(f3);
        g.drawString("Monospaced 20p ITALIC",10,90);
        g.setFont(f4);
        g.drawString("Dialog 20p BOLD+ITALIC",10,110);
        g.setFont(f5);
        g.drawString("DialogInput 20p BOLD",10,130);
    }
}

class FontTest extends JFrame{
    public FontTest(){
        setSize(500,200);
        setTitle("Font Test");
        JPanel panel = new FontFrame();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new FontTest();
    }
}
