import javax.swing.*;
import java.awt.event.*;
public class Buttons extends JButton implements ActionListener{
    ImageIcon x,o;
    byte value = 0;

    public Buttons(){
        x=new ImageIcon(this.getClass().getResource("X1-small.png"));
        o=new ImageIcon(this.getClass().getResource("O1-small.png"));
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        value++;
        value%=3;
        switch(value){
            case 0:
            setIcon(null);
            break;
            case 1:
            setIcon(x);
            break;
            case 2:
            setIcon(o);
            break;

        }
    }
}