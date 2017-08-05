import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class homePanel extends JPanel
{
    
        JButton startJB, instructionsJB, designerJB, scoresJB;
        JLabel statueJL, titleJL;
        ImageIcon statueIMG;
    
	public homePanel()
	{
		super();
                setLayout(null);
		setBackground(new Color(0,51,102));
                setSize(900,800);
                
                titleJL = new JLabel("PENN STATE SNAKE", SwingConstants.CENTER);
                titleJL.setFont(new Font("Phosphate",Font.PLAIN, 100));
                titleJL.setForeground(Color.white);
                titleJL.setBounds(0, 0, 900, 200);
                add(titleJL);
                
                statueIMG = new ImageIcon("images/statue.jpg");
                statueJL = new JLabel(statueIMG);
                statueJL.setBounds(0, 200, 900, 400);
                add(statueJL);
                
                startJB = new JButton("START");
                startJB.setFont(new Font("Century Gothic",Font.PLAIN, 60));
                startJB.setBackground(Color.white);
                startJB.setForeground(Color.black);
                startJB.setBounds(325, 625, 250, 75);
                add(startJB);
                
                instructionsJB = new JButton("INSTRUCTIONS");
                instructionsJB.setFont(new Font("Century Gothic",Font.PLAIN, 25));
                instructionsJB.setBackground(Color.white);
                instructionsJB.setForeground(Color.black);
                instructionsJB.setBounds(50, 638, 225, 50);
                add(instructionsJB);
                
                designerJB = new JButton("CREDITS");
                designerJB.setFont(new Font("Century Gothic",Font.PLAIN, 25));
                designerJB.setBackground(Color.white);
                designerJB.setForeground(Color.black);
                designerJB.setBounds(375, 715, 150, 50);
                add(designerJB);
                
                scoresJB = new JButton("HIGH SCORES");
                scoresJB.setFont(new Font("Century Gothic",Font.PLAIN, 25));
                scoresJB.setBackground(Color.white);
                scoresJB.setForeground(Color.black);
                scoresJB.setBounds(625, 638, 225, 50);
                add(scoresJB);
	}
        
}
