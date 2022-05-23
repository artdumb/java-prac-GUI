import javax.swing.*;
import java.awt.*;
import java.util.Random;

class PizzaFrame extends JFrame{
    public PizzaFrame(){
        setSize(600,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("pizza frame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        JLabel label1 = new JLabel("자바피자에 오신 것을 환영합니다! 피자의 종류를 선택하시오.");
        panelA.add(label1);

        JButton button1 = new JButton("콤보피자");
        JButton button2 = new JButton("포테이토피자");
        JButton button3 = new JButton("불고기피자");
        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        JLabel label2 = new JLabel("개수");
        JTextField field1 = new JTextField(10);
        panelB.add(label2);
        panelB.add(field1);

        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);
    }
}

class LoginWindow extends JFrame {
    public LoginWindow(){
        setTitle("login window");
        setSize(300,150);
        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JLabel("ID"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("PW"));
        panel.add(new JPasswordField(20));

        JButton login = new JButton("login");
        panel.add(login);

        JButton cancel = new JButton("cancel");
        panel.add(cancel);
        setVisible(true);
    }


}

class Calculator extends JFrame{
    private JPanel panel;
    private JTextField tField;
    private JButton[] bottons;
    private String[] labels = {
            "backspace","","","CE","C",
            "7","8","9","/","sqrt",
            "4","5","6","x","%",
            "1","2","3","-","1/x",
            "0","+/-",".","+","="
    };

    public Calculator() {
        tField= new JTextField(35);
        panel = new JPanel();
        tField.setText("0.");
        tField.setEnabled(false);

        panel.setLayout(new GridLayout(0,5,3,3));
        bottons = new JButton[25];
        int index = 0;
        for (int rows = 0;rows<5;rows++){
            for (int cols = 0;cols<5;cols++){
                bottons[index] = new JButton(labels[index]);
                if(cols>=3) bottons[index].setForeground(Color.red);
                else bottons[index].setBackground(Color.yellow);
                panel.add(bottons[index]);
                index++;

            }
        }

        add(tField,BorderLayout.NORTH);
        add(panel,BorderLayout.CENTER);
        setVisible(true);
        pack();
    }
}




class ImageViewer extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    public ImageViewer(){

        setLayout(new BorderLayout());
        setSize(500,300);
        panel1 = new JPanel();
        label = new JLabel("");
        ImageIcon icon = new ImageIcon("img_2.png");
        Image img = icon.getImage();
        Image changeImg = img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(changeImg);
        label.setIcon(changeIcon);




        panel1.add(label);

        btn1 = new JButton("<<");
        btn2 = new JButton("<");
        btn3 = new JButton(">");
        btn4 = new JButton(">>");
        panel2 = new JPanel();
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);

        add(panel1,"North");
        add(panel2,"South");
        setVisible(true);



    }

}
class RegistUserForm extends JFrame{
    JPanel pLeft;
    JPanel pRight;
    JPanel pTop;
    JPanel pBotton;
    public RegistUserForm(){
        //
        setLayout(new BorderLayout());
        setTitle("registUser");
        setSize(400,300);
        //왼쪽
        pLeft = new JPanel();
        pLeft.setLayout(new GridLayout(4,2,5,5));
        JLabel name = new JLabel("이름");
        JLabel pw = new JLabel("패스워드");
        JLabel email = new JLabel("이메일주소");
        JLabel phone = new JLabel("전화번호");
        pLeft.add(name);
        pLeft.add(pw);
        pLeft.add(email);
        pLeft.add(phone);

        add(pLeft,"West");
        //오른쪽
        pRight = new JPanel();
        pRight.setLayout(new GridLayout(4,0,5,5));
        JTextField nameField = new JTextField(20);
        JTextField pwField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JTextField phoneField = new JTextField(20);
        pRight.add(nameField);
        pRight.add(pwField);
        pRight.add(emailField);
        pRight.add(phoneField);
        add(pRight,"East");

        //위쪽
        pTop = new JPanel();
        JLabel lab = new  JLabel("회원 등록하기");
        pTop.add(lab);
        add(pTop,"North");

        //아래쪽
        pBotton = new JPanel();
        JButton btn1 = new JButton("등록하기");
        JButton btn2 = new JButton("취소");
        pBotton.add(btn1);
        pBotton.add(btn2);
        add(pBotton,"South");


       setVisible(true);

    }
}

class randomLayout extends JFrame{
    JLabel labels[];
    Random rand = new Random();
    public randomLayout(){
        //
        setLayout(null);
        setSize(500,200);



        labels = new JLabel[30];
        for(int i=0;i<30;i++){
            labels[i] = new JLabel(Integer.toString(i));
            int x = rand.nextInt(500)+1;
            int y = rand.nextInt(200)+1;
            add(labels[i]);
            labels[i].setBounds(x,y,5,5);
        }

        setVisible(true);
    }

}
public class asign2 {
    public static void main(String[] args){
        //new LoginWindow();
        //new PizzaFrame();
        //new Calculator();
        //new ImageViewer();
        //new RegistUserForm();
        new randomLayout();
    }
}
