import javax.swing.*;

public class BasicSwing extends JFrame
{
    JPanel p = new JPanel();
    JButton b = new JButton("Hello");
    JTextField t = new JTextField("HOLA", 20);
    JTextArea ta = new JTextArea("HOW ART THOU?", 5, 20);

    public static void main(String ars[]){
        new BasicSwing();
    }

    public BasicSwing()
    {
        super("Basic Swing");
        setSize(600,400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        p.add(b);
        p.add(t);
        p.add(ta);
        add(p);

    }
}