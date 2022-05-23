import javax.swing.*;
import java.awt.*;

class ImageLabelTest extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ImageLabelTest(){
        setTitle("레이블이미지테스트");
        setSize(1000,1000);
        panel = new JPanel();
        label = new JLabel("");
        ImageIcon icon = new ImageIcon("img_1.png");
        label.setIcon(icon);
        button = new JButton("자세한 정보를 보려면 클릭;");
        button.setIcon(icon);
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);

    }
}
class LabelTest extends JFrame{
    private JPanel panel;
    private JLabel label1, label2;

    public LabelTest(){
        setTitle("레이블 테스트");
        setSize(400,150);


        panel = new JPanel();
        label1 = new JLabel("Color Label");
        label1.setForeground(Color.BLUE);
        label2 = new JLabel("Font Label");
        label2.setFont(new Font("Arial",Font.ITALIC,30));
        label2.setForeground(Color.ORANGE);
        panel.add(label1);
        panel.add(label2);
        add(panel);
        setVisible(true);
    }
}

class BorderLayoutFrame extends JFrame{
    public BorderLayoutFrame() {
        setTitle("BorderLayoutTest");
        setSize(300,150);
        setLayout(new BorderLayout());

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        add(b1,"North");
        add(b2,"South");
        add(b3,"East");
        add(b4,"West");
        add(b5,"Center");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

class MyFrameWithPanel extends JFrame{
    public MyFrameWithPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        JButton button1 = new JButton("확인");
        //button의 기본색이 투명으로 설정되어있음
        button1.setOpaque(true);
        //버튼의 외곽선을 없애준다.
        button1.setBorderPainted(false);
        button1.setBackground(Color.RED);
        JButton button2 = new JButton("취소");
        //button의 기본색이 투명으로 설정되어있음 -> 투명도 false
        button2.setOpaque(true);
        //버튼의 외곽선을 없애준다.
        button2.setBorderPainted(false);
        button2.setBackground(Color.cyan);
        panel.add(button1);
        panel.add(button2);
        add(panel);
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


class MyFrame extends JFrame{
    public MyFrame() {

        setTitle("myframe");
        setSize(300,150);
        setLocation(200,300);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        this.add(button1);
        this.add(button2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class GuiTest {
    public static void main(String[] args){
        //MyFrame f=new MyFrame();
        //MyFrameWithPanel f2 = new MyFrameWithPanel();
        //BorderLayoutFrame f3 = new BorderLayoutFrame();
        //LabelTest f4 = new LabelTest();
        ImageLabelTest f5 = new ImageLabelTest();
    }
}
