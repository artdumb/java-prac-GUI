import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame implements ActionListener {

    private JRadioButton small, medium, large;
    private JLabel text;
    private JPanel topPanel,sizePanel,resultPanel;

    public RadioButtonFrame(){
        setTitle("라디오버튼");
        setSize(500,150);

        topPanel = new JPanel();
        topPanel.add(new JLabel("어떤크기"));
        add(topPanel,BorderLayout.NORTH);

        sizePanel = new JPanel();
        small = new JRadioButton("스몰");
        medium = new JRadioButton("미디엄");
        large = new JRadioButton("라지");

        ButtonGroup size = new ButtonGroup();
        size.add(small);
        size.add(medium);
        size.add(large);
        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);

        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);
        add(sizePanel,BorderLayout.CENTER);
        add(sizePanel,BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("크기가 선택x");
        text.setForeground(Color.red);
        resultPanel.add(text);
        add(resultPanel,BorderLayout.SOUTH);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== small){
            text.setText("스몰");
        }
        if(e.getSource()== medium){
            text.setText("미디엄");
        }
        if(e.getSource()== large){
            text.setText("라지");
        }
    }
    public static void main(String[] args){
        new RadioButtonFrame();
    }
}
