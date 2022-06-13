import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class WelcomePanel extends JPanel
{
    private JLabel message;
    public WelcomePanel(){
        message = new JLabel("자바 피자에 오신 것을 환영합니다.");
        add(message);
    }


}
class TypePanel extends JPanel{
    private JRadioButton combo,potato,bulgogi;
    public TypePanel(){
        setLayout(new GridLayout(3,1));
        combo = new JRadioButton("콤보",true);
        potato = new JRadioButton("포테이토");
        bulgogi = new JRadioButton("불고기");

        ButtonGroup bg = new ButtonGroup();
        bg.add(combo);
        bg.add(potato);
        bg.add(bulgogi);
        setBorder(BorderFactory.createTitledBorder("종류"));
        add(combo);
        add(potato);
        add(bulgogi);

    }
}

class ToppingPanel extends JPanel {
    private JCheckBox pmang, cheese, peperoni, bacon;

    public ToppingPanel() {
        setLayout(new GridLayout(4, 1));
        pmang = new JCheckBox("피망");
        pmang.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        cheese = new JCheckBox("치즈");
        cheese.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        peperoni = new JCheckBox("페퍼로니");
        peperoni.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        bacon = new JCheckBox("베이컨");
        bacon.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        add(pmang);
        add(cheese);
        add(peperoni);
        add(bacon);
        setBorder(BorderFactory.createTitledBorder("추가토핑"));


    }
}
class SizePanel extends JPanel{
    private JRadioButton small,medium,large;
    public SizePanel(){
        setLayout(new GridLayout(3,1));
        small = new JRadioButton("small",true);
        medium = new JRadioButton("medium");
        large = new JRadioButton("large");

        ButtonGroup bg = new ButtonGroup();
        bg.add(small);
        bg.add(medium);
        bg.add(large);
        setBorder(BorderFactory.createTitledBorder("크기"));
        add(small);
        add(medium);
        add(large);

    }
}

class ButtonPanel extends JPanel{
    private JButton orders,cancel;
    public ButtonPanel(){
        setLayout(new GridLayout(1,2));
        orders = new JButton("주문");
        cancel = new JButton("취소");

        add(orders);
        add(cancel);
    }
}

public class WelcomePizzaPanel extends JFrame{
    public WelcomePizzaPanel(){
        setTitle("연습~!");
        setSize(600,300);
        setLayout(new BorderLayout());

        SizePanel sizePanel = new SizePanel();
        TypePanel typePanel = new TypePanel();
        WelcomePanel welcomePanel = new WelcomePanel();
        ToppingPanel toppingPanel = new ToppingPanel();
        ButtonPanel buttonPanel = new ButtonPanel();


        add(welcomePanel,"North");
        add(typePanel,"West");
        add(sizePanel,"East");
        add(toppingPanel,"Center");
        add(buttonPanel,"South");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new WelcomePizzaPanel();
    }
}
