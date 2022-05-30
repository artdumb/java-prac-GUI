import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawRecFrame extends JFrame {
    int x,y;
    class DrawRecPanel extends JPanel{
        public DrawRecPanel(){
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }
            });
        }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.orange);
            g.fillRect(x,y,100,100);
        }
    }

    public DrawRecFrame(){
        setTitle("Basic Painting");
        setSize(600,200);
        add(new DrawRecPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new DrawRecFrame();
    }
}
