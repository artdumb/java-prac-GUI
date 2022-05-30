import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class PaintApp extends JFrame {
    int x,y;
    Vector<Point> list = new Vector<>();

    class PaintPanel extends JPanel{
        public PaintPanel(){
            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    list.add(new Point(x,y));
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            for (Point p:list)
                g.fillOval(p.x,p.y,4,4);
        }

    }

    public PaintApp(){
        setSize(600,150);
        setTitle("My Paint");
        add(new PaintPanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new PaintApp();
    }
}
