import javax.swing.*;
import java.awt.*;
public class TicTacToe extends JFrame {
	JPanel p = new JPanel();
	JLabel l ;
	Buttons buttons[] = new Buttons[12];
	//Buttons win[][]=new Buttons[3][3];
	public static void main(String ars[]){
		new TicTacToe();
	}

	public TicTacToe(){
		super("TicTacToe");
		setResizable(false);
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		p.setLayout(new GridLayout(3,3));
		for(int i=0; i<12;i++){
			buttons[i]=new Buttons();
			p.add(buttons[i]);
		}
		/*for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(win[i][0] == win[i][1] && win[i][0] == win[i][2])
					l=new JLabel("Wins");
			}
			
		}*/
		

		add(p);

		setVisible(true);
	}
}