import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class optionsPanel extends JPanel implements ActionListener
{
        JButton homeJB, playJB, lionJB, girlJB, boyJB, beaverJB, creameryJB, libraryJB, slowJB, mediumJB, fastJB;
        gamePanel gp;
        ImageIcon lionIMG, girlIMG, boyIMG, beaverIMG, creameryIMG, libraryIMG, icecreamIMG, footballIMG, bookIMG, homeIMG;
        JLabel titleJL, nameJL, characterJL, settingJL, speedJL;
        JTextField nameTF;
    
        public optionsPanel(gamePanel informedGP)
        {
                super();
                setBackground(new Color(0,51,102));
                setLayout(null);
                
                gp = informedGP;
                
                titleJL = new JLabel("GAME OPTIONS", SwingConstants.CENTER);
                titleJL.setFont(new Font("Phosphate",Font.PLAIN, 70));
                titleJL.setForeground(Color.white);
                titleJL.setBounds(0, 25, 900, 75);
                add(titleJL);
                
                homeIMG = new ImageIcon("images/home.jpg");
                homeJB = new JButton(homeIMG);
                homeJB.setBounds(825, 25, 40, 40);
                add(homeJB);
                
                nameJL = new JLabel("Type your Name", SwingConstants.CENTER);
                nameJL.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                nameJL.setForeground(Color.white);
                nameJL.setBounds(300,100,300,50);
                add(nameJL);
                
                nameTF = new JTextField("", 250);
                nameTF.setBounds(325, 150, 250, 35);
                nameTF.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                nameTF.addActionListener(this);
                add(nameTF);
                
                characterJL = new JLabel("Choose your Character", SwingConstants.CENTER);
                characterJL.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                characterJL.setForeground(Color.white);
                characterJL.setBounds(300,200,300,50);
                add(characterJL);
                
                lionIMG = new ImageIcon("images/lion.jpg");
                girlIMG = new ImageIcon("images/girl.jpg");
                boyIMG = new ImageIcon("images/boy.jpg");
                beaverIMG = new ImageIcon("images/stadium.jpg");
                creameryIMG = new ImageIcon("images/creamery.jpg");
                libraryIMG = new ImageIcon("images/library.jpg");
                icecreamIMG = new ImageIcon("images/icecream.jpg");
                footballIMG = new ImageIcon("images/football.jpg");
                bookIMG = new ImageIcon("images/book.jpg");
                
                lionJB = new JButton(lionIMG);
                lionJB.addActionListener(this);
                lionJB.setBackground(Color.gray);
                lionJB.setBounds(410,250,80,80);
                add(lionJB);
                
                girlJB = new JButton(girlIMG);
                girlJB.setBackground(Color.white);
                girlJB.addActionListener(this);
                girlJB.setBounds(295,250,80,80);
                add(girlJB);
                
                boyJB = new JButton(boyIMG);
                boyJB.setBackground(Color.white);
                boyJB.addActionListener(this);
                boyJB.setBounds(525,250,80,80);
                add(boyJB);
                
                settingJL = new JLabel("Choose the Setting", SwingConstants.CENTER);
                settingJL.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                settingJL.setForeground(Color.white);
                settingJL.setBounds(300,340,300,50);
                add(settingJL);
                
                beaverJB = new JButton("Beaver Stadium");
                beaverJB.setFont(new Font("Century Gothic",Font.PLAIN, 21));
                beaverJB.setForeground(Color.black);
                beaverJB.setBackground(Color.white);
                beaverJB.addActionListener(this);
                beaverJB.setBounds(100,400,200,50);
                add(beaverJB);
                
                creameryJB = new JButton("The Creamery");
                creameryJB.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                creameryJB.setForeground(Color.black);
                creameryJB.setBackground(Color.gray);
                creameryJB.addActionListener(this);
                creameryJB.setBounds(350,400,200,50);
                add(creameryJB);
                
                libraryJB = new JButton("The Library");
                libraryJB.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                libraryJB.setForeground(Color.black);
                libraryJB.setBackground(Color.white);
                libraryJB.addActionListener(this);
                libraryJB.setBounds(600,400,200,50);
                add(libraryJB);
                
                speedJL = new JLabel("Speed", SwingConstants.CENTER);
                speedJL.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                speedJL.setForeground(Color.white);
                speedJL.setBounds(300,465,300,50);
                add(speedJL);
                
                slowJB = new JButton("Slow");
                slowJB.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                slowJB.setForeground(Color.black);
                slowJB.setBackground(Color.white);
                slowJB.addActionListener(this);
                slowJB.setBounds(100,525,200,50);
                add(slowJB);
                
                mediumJB = new JButton("Medium");
                mediumJB.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                mediumJB.setForeground(Color.black);
                mediumJB.setBackground(Color.gray);
                mediumJB.addActionListener(this);
                mediumJB.setBounds(350,525,200,50);
                add(mediumJB);
                
                fastJB = new JButton("Fast");
                fastJB.setFont(new Font("Century Gothic",Font.PLAIN, 22));
                fastJB.setForeground(Color.black);
                fastJB.setBackground(Color.white);
                fastJB.addActionListener(this);
                fastJB.setBounds(600,525,200,50);
                add(fastJB);
                
                playJB = new JButton("Play!");
                playJB.setFont(new Font("Phosphate",Font.PLAIN, 80));
                playJB.setForeground(Color.white);
                playJB.setBackground(new Color(0,51,102));
                playJB.setBounds(300,625,300,100);
                add(playJB);
        }

        
        public void actionPerformed(ActionEvent e)
        {
                Object obj = e.getSource();
                if(obj == lionJB)
                {
                    lionJB.setBackground(Color.gray);
                    girlJB.setBackground(Color.white);
                    boyJB.setBackground(Color.white);
                    gp.head.setIcon(lionIMG);
                }
                else if(obj == girlJB)
                {
                    lionJB.setBackground(Color.white);
                    girlJB.setBackground(Color.gray);
                    boyJB.setBackground(Color.white);
                    gp.head.setIcon(girlIMG);
                }
                else if(obj == boyJB)
                {
                    lionJB.setBackground(Color.white);
                    girlJB.setBackground(Color.white);
                    boyJB.setBackground(Color.gray);
                    gp.head.setIcon(boyIMG);
                }
                if(obj == beaverJB)
                {
                    beaverJB.setBackground(Color.gray);
                    creameryJB.setBackground(Color.white);
                    libraryJB.setBackground(Color.white);
                    gp.settingJL.setText("Beaver Stadium");
                    gp.backgroundIMG.setIcon(beaverIMG);
                    gp.tokenJB.setIcon(footballIMG);
                }
                else if(obj == creameryJB)
                {
                    beaverJB.setBackground(Color.white);
                    creameryJB.setBackground(Color.gray);
                    libraryJB.setBackground(Color.white);
                    gp.settingJL.setText("The Creamery");
                    gp.backgroundIMG.setIcon(creameryIMG);
                    gp.tokenJB.setIcon(icecreamIMG);
                }
                else if(obj == libraryJB)
                {
                    beaverJB.setBackground(Color.white);
                    creameryJB.setBackground(Color.white);
                    libraryJB.setBackground(Color.gray);
                    gp.settingJL.setText("Pattee-Paterno Library");
                    gp.backgroundIMG.setIcon(libraryIMG);
                    gp.tokenJB.setIcon(bookIMG);
                }
                if(obj == slowJB)
                {
                    slowJB.setBackground(Color.gray);
                    mediumJB.setBackground(Color.white);
                    fastJB.setBackground(Color.white);
                    gp.speedJL.setText("Speed: Slow");
                    gp.tim.setDelay(175);
                }
                else if(obj == mediumJB)
                {
                    slowJB.setBackground(Color.white);
                    mediumJB.setBackground(Color.gray);
                    fastJB.setBackground(Color.white);
                    gp.speedJL.setText("Speed: Medium");
                    gp.tim.setDelay(125);
                }
                else if(obj == fastJB)
                {
                    slowJB.setBackground(Color.white);
                    mediumJB.setBackground(Color.white);
                    fastJB.setBackground(Color.gray);
                    gp.speedJL.setText("Speed: Fast");
                    gp.tim.setDelay(75);
                }
                
        }
        
}
