import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddGUI{
    public static void main(String[] args) {
        Add obj = new Add();
    }

}

class Add extends JFrame implements ActionListener {
    JTextField t1,t2,t3;
    JLabel l, l1 ;
    JButton b1;
    public Add(){
        t1= new JTextField(20);
        t1.setBounds(200, 50, 150, 20);
        t2 = new JTextField(20);
        t2.setBounds(200, 100, 150, 20);
        l= new JLabel();
       
        // l1=new JLabel();
        // l1.setBounds(100, 150, 150, 20);
        b1 = new JButton("OK");
        b1.setBounds(200,150, 100, 100);	
        add(t1);
        add(t2);
        add(l);
        add(b1);
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    public void actionPerformed(ActionEvent a){
        int n1,n2;
        n1 = Integer.valueOf(t1.getText());
        n2 = Integer.valueOf(t2.getText());
        int r = n1 + n2;
         l.setBounds(50, 200, 150, 20);
        l.setText("Result:"+r );
    }
}