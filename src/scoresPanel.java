import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class scoresPanel extends JPanel
{
        JLabel titleJL, s1JL, i1JL, s2JL, i2JL, s3JL, i3JL, s4JL, i4JL, s5JL, i5JL;
        JButton homeJB;
        XML_240 x2;
        String s1,s2,s3,s4,s5;
        int i1,i2,i3,i4,i5, nextScore;
        String name;
        ImageIcon homeIMG;
    
        public scoresPanel()
        {
                super();
		setBackground(new Color(0,51,102));
                setLayout(null);
                
                titleJL = new JLabel("HIGH SCORES", SwingConstants.CENTER);
                titleJL.setFont(new Font("Phosphate", Font.PLAIN, 70));
                titleJL.setForeground(Color.white);
                titleJL.setBounds(0, 25, 900, 75);
                add(titleJL);
                
                homeIMG = new ImageIcon("images/home.jpg");
                homeJB = new JButton(homeIMG);
                homeJB.setBounds(825, 25, 40, 40);
                add(homeJB);
                
                x2 = new XML_240();
                x2.openReaderXML("XML_text.xml");
                
                s1 = (String)x2.ReadObject();
                i1 = (int)x2.ReadObject();
                s2 = (String)x2.ReadObject();
                i2 = (int)x2.ReadObject();
                s3 = (String)x2.ReadObject();
                i3 = (int)x2.ReadObject();
                s4 = (String)x2.ReadObject();
                i4 = (int)x2.ReadObject();
                s5 = (String)x2.ReadObject();
                i5 = (int)x2.ReadObject();

                x2.closeReaderXML();
                
                i1JL = new JLabel("" + i1, SwingConstants.CENTER);
                i1JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                i1JL.setForeground(Color.white);
                i1JL.setBounds(600, 150, 100, 100);
                add(i1JL);
                
                i2JL = new JLabel("" + i2, SwingConstants.CENTER);
                i2JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                i2JL.setForeground(Color.white);
                i2JL.setBounds(600, 250, 100, 100);
                add(i2JL);
                
                i3JL = new JLabel("" + i3, SwingConstants.CENTER);
                i3JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                i3JL.setForeground(Color.white);
                i3JL.setBounds(600, 350, 100, 100);
                add(i3JL);
                
                i4JL = new JLabel("" + i4, SwingConstants.CENTER);
                i4JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                i4JL.setForeground(Color.white);
                i4JL.setBounds(600, 450, 100, 100);
                add(i4JL);
                
                i5JL = new JLabel("" + i5, SwingConstants.CENTER);
                i5JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                i5JL.setForeground(Color.white);
                i5JL.setBounds(600, 550, 100, 100);
                add(i5JL);
                
                s1JL = new JLabel("1) " + s1, SwingConstants.LEFT);
                s1JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                s1JL.setForeground(Color.white);
                s1JL.setBounds(200, 150, 600, 100);
                add(s1JL);
                
                s2JL = new JLabel("2) " + s2, SwingConstants.LEFT);
                s2JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                s2JL.setForeground(Color.white);
                s2JL.setBounds(200, 250, 600, 100);
                add(s2JL); 
                
                s3JL = new JLabel("3) " + s3, SwingConstants.LEFT);
                s3JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                s3JL.setForeground(Color.white);
                s3JL.setBounds(200, 350, 600, 100);
                add(s3JL); 
                
                s4JL = new JLabel("4) " + s4, SwingConstants.LEFT);
                s4JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                s4JL.setForeground(Color.white);
                s4JL.setBounds(200, 450, 600, 100);
                add(s4JL); 
                
                s5JL = new JLabel("5) " + s5, SwingConstants.LEFT);
                s5JL.setFont(new Font("Century Gothic", Font.PLAIN, 24));
                s5JL.setForeground(Color.white);
                s5JL.setBounds(200, 550, 600, 100);
                add(s5JL); 
        }
        
        public void setHighScores(int informedFinalScore, String informedName)
        {
                nextScore = informedFinalScore;
                name = informedName;
                if(nextScore >= i1)
                {
                    i5 = i4;
                    i4 = i3;
                    i3 = i2;
                    i2 = i1;
                    i1 = nextScore;
                    
                    s5 = s4;
                    s4 = s3;
                    s3 = s2;
                    s2 = s1;
                    s1 = name;
                }
                else if(nextScore >= i2)
                {
                    i5 = i4;
                    i4 = i3;
                    i3 = i2;
                    i2 = nextScore;
                    
                    s5 = s4;
                    s4 = s3;
                    s3 = s2;
                    s2 = name;
                }
                else if(nextScore >= i3)
                {
                    i5 = i4;
                    i4 = i3;
                    i3 = nextScore;
                    
                    s5 = s4;
                    s4 = s3;
                    s3 = name;
                }
                else if(nextScore >= i4)
                {
                    i5 = i4;
                    i4 = nextScore;
                    
                    s5 = s4;
                    s4 = name;
                }
                else if(nextScore >= i5){
                    i5 = nextScore;
                    
                    s5 = name;
                }
                
                x2.openWriterXML("XML_text.xml");
                x2.writeObject(s1);
                x2.writeObject(i1);
                x2.writeObject(s2);
                x2.writeObject(i2);
                x2.writeObject(s3);
                x2.writeObject(i3);
                x2.writeObject(s4);
                x2.writeObject(i4);
                x2.writeObject(s5);
                x2.writeObject(i5);
                x2.closeWriterXML();

                i1JL.setText("" + i1);
                i2JL.setText("" + i2);
                i3JL.setText("" + i3);
                i4JL.setText("" + i4);
                i5JL.setText("" + i5);
                
                s1JL.setText("1) " + s1);
                s2JL.setText("2) " + s2);
                s3JL.setText("3) " + s3);
                s4JL.setText("4) " + s4);
                s5JL.setText("5) " + s5);
        }    

}
