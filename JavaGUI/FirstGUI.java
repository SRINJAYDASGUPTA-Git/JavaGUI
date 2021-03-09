import javax.swing.*;
import java.awt.*;
public class FirstGUI {
    public static void main(String ars[])
    {
        Abc ob =new Abc();

    }
}

class Abc extends JFrame {
    public Abc() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l = new JLabel("Hello");
        JLabel l1 = new JLabel("Welcome");
        add(l);
        add(l1);
        

    }
}