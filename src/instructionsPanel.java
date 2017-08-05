import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class instructionsPanel extends JPanel
{
        JButton homeJB;
        JLabel titleJL, oneJL, twoJL, threeJL, fourJL;
        ImageIcon homeIMG;
        
	public instructionsPanel()
	{
		super();
		setBackground(new Color(0,51,102));
                setLayout(null);
                
                titleJL = new JLabel("INSTRUCTIONS", SwingConstants.CENTER);
                titleJL.setFont(new Font("Phosphate",Font.PLAIN, 70));
                titleJL.setForeground(Color.white);
                titleJL.setBounds(0, 25, 900, 75);
                add(titleJL);
                
                homeIMG = new ImageIcon("images/home.jpg");
                homeJB = new JButton(homeIMG);
                homeJB.setBounds(825, 25, 40, 40);
                add(homeJB);
                
                oneJL = new JLabel("1) Move the snake around using the arrow keys.", SwingConstants.LEFT);
                oneJL.setFont(new Font("Century Gothic", Font.PLAIN, 18));
                oneJL.setForeground(Color.white);
                oneJL.setBounds(100,125,700,100);
                add(oneJL);
                
                twoJL = new JLabel("2) Collect the tokens on the screen.", SwingConstants.LEFT);
                twoJL.setFont(new Font("Century Gothic", Font.PLAIN, 18));
                twoJL.setForeground(Color.white);
                twoJL.setBounds(100,200,700,100);
                add(twoJL);
                
                threeJL = new JLabel("3) Every token that you collect will make the snake longer.", SwingConstants.LEFT);
                threeJL.setFont(new Font("Century Gothic", Font.PLAIN, 18));
                threeJL.setForeground(Color.white);
                threeJL.setBounds(100,275,700,100);
                add(threeJL);
                
                fourJL = new JLabel("4) Avoid running the snake into the edges of the board or into itself.", SwingConstants.LEFT);
                fourJL.setFont(new Font("Century Gothic", Font.PLAIN, 18));
                fourJL.setForeground(Color.white);
                fourJL.setBounds(100,350,700,100);
                add(fourJL);
	}
        
}
