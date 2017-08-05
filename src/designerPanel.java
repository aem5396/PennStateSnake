import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class designerPanel extends JPanel
{
        JButton homeJB;
        JLabel titleJL, designerJL, classJL;
        ImageIcon homeIMG;
    
	public designerPanel()
	{
		super();
		setBackground(new Color(0,51,102));
                setLayout(null);
                
                titleJL = new JLabel("CREDITS", SwingConstants.CENTER);
                titleJL.setFont(new Font("Phosphate", Font.PLAIN, 70));
                titleJL.setForeground(Color.white);
                titleJL.setBounds(0, 25, 900, 75);
                add(titleJL);
                
                homeIMG = new ImageIcon("images/home.jpg");
                homeJB = new JButton(homeIMG);
                homeJB.setBounds(825, 25, 40, 40);
                add(homeJB);
                
                designerJL = new JLabel("Game Designed by Anna Miller", SwingConstants.CENTER);
                designerJL.setFont(new Font("Centruy Gothic", Font.PLAIN, 40));
                designerJL.setForeground(Color.white);
                designerJL.setBounds(100,150,700,100);
                add(designerJL);
                
                classJL = new JLabel("IST 240 Summer 2016", SwingConstants.CENTER);
                classJL.setFont(new Font("Centruy Gothic", Font.PLAIN, 34));
                classJL.setForeground(Color.white);
                classJL.setBounds(100,250,700,100);
                add(classJL);       
	}
        
}