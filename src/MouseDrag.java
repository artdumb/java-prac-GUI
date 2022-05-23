import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDrag extends JFrame {
    JPanel panel;

    public MouseDrag(){
        setTitle("Mouse Event");
        setSize(300,200);

        panel = new JPanel();
        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println(e);
            }
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new MouseDrag();
    }}
