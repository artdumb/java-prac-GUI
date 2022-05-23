import javax.swing.*;
import java.awt.*;

public class GraphicFrame1 extends JFrame {
    class MyPanel extends JPanel{
        protected void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawOval(60, 50, 60, 60);
            g.drawRect(120, 50, 60, 60);
            g.setColor(Color.black);
            g.fillOval(180, 50, 60, 60);
            g.fillRect(240, 50, 60, 60);
        }
    }



    public GraphicFrame1() {
        setTitle("Basic Paonting");
        setSize(600,200);
        add(new MyPanel());
        setVisible(true);
    }
    public static void main(String[] args){
        GraphicFrame1 f= new GraphicFrame1();
    }
}