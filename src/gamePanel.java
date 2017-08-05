import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class gamePanel extends JPanel implements KeyListener, ActionListener
{
        JButton homeJB, tokenJB;
        character head;
        JLabel settingJL, backgroundIMG, speedJL, scoreJL, endJL;
        ImageIcon creameryIMG, tokenIMG, icecreamIMG, homeIMG;
        int x, y, delay, seconds, score, jbx, jby, randomAddX, randomAddY;
        Timer tim;
        boolean left,right,up,down;
        JButton[] tail = new JButton[10000];
        int[] headX,headY;
        scoresPanel sp;
        String name;
        
        public gamePanel(scoresPanel informedSP)
        {
                super();
                sp = informedSP;
                setBackground(Color.white);
                setLayout(null);
                
                settingJL = new JLabel("The Creamery", SwingConstants.CENTER);
                settingJL.setFont(new Font("Phosphate",Font.PLAIN, 50));
                settingJL.setForeground(Color.white);
                settingJL.setBounds(100, 0, 700, 100);
                add(settingJL);
                
                homeIMG = new ImageIcon("images/home.jpg");
                homeJB = new JButton(homeIMG);
                homeJB.setBounds(825, 25, 40, 40);
                add(homeJB);
                
                creameryIMG = new ImageIcon("images/creamery.jpg");
                backgroundIMG = new JLabel(creameryIMG);
                backgroundIMG.setBounds(0,0,900,100);
                add(backgroundIMG);

                speedJL = new JLabel("Speed: Medium", SwingConstants.CENTER);
                speedJL.setFont(new Font("Century Gothic",Font.PLAIN, 18));
                speedJL.setForeground(Color.black);
                speedJL.setBounds(50,100,200,50);
                add(speedJL);
                               
                score = 0;
                scoreJL = new JLabel("Score: 0", SwingConstants.CENTER);
                scoreJL.setFont(new Font("Century Gothic",Font.PLAIN, 18));
                scoreJL.setForeground(Color.black);
                scoreJL.setBounds(700,100,100,50);
                add(scoreJL);
                
                x = 425;
                y = 400;
                head = new character();
                head.setBounds(x,y,50,50);
                head.setOpaque(true);
                add(head);
                
                tokenIMG = new ImageIcon("images/icecream.jpg");
                tokenJB = new JButton(tokenIMG);
                randomAddX = (int)(Math.random() * 17);
                jbx = 25 + randomAddX*50;
                randomAddY = (int)(Math.random() * 11);
                jby = 150 + randomAddY*50;
                tokenJB.setBounds(jbx,jby,50,50);
                add(tokenJB);
                
                for(int i = 1; i < 10000; i++)
                {
                    tail[i] = new JButton();
                    tail[i].setBackground(Color.white);
                }
                
                headX = new int[10000];
                headX[0] = 425;
                headY = new int[10000];
                headY[0] = 400;
                
                delay = 125;
                tim = new Timer(delay, this);
                
                left = false;
                right = true;
                up = false;
                down = false;
                
                endJL = new JLabel("",SwingConstants.CENTER);
                endJL.setFont(new Font("Phosphate", Font.PLAIN, 48));
                endJL.setForeground(Color.red);
                endJL.setBounds(300,100,300,50);

                name = "";
                
                setFocusable(true);
                addKeyListener(this);
                requestFocusInWindow();
        }
        
        public void getName(String informedName)
        {
                name = informedName;
        }

        public void keyTyped(KeyEvent e)
        {
            
        }

        public void keyPressed(KeyEvent e)
        {
            int k = e.getKeyCode();
            if(k == e.VK_LEFT)
            {
                left = true;
                right = false;
                up = false;
                down = false;
            }
            if(k == e.VK_RIGHT)
            {
                left = false;
                right = true;
                up = false;
                down = false;
            }
            if(k == e.VK_UP)
            {
                left = false;
                right = false;
                up = true;
                down = false;
            }
            if(k == e.VK_DOWN)
            {
                left = false;
                right = false;
                up = false;
                down = true;
            }
        }

        public void keyReleased(KeyEvent e)
        {
        
        }

        public void actionPerformed(ActionEvent e)
        {
                Object obj = e.getSource();
                if(obj == tim)
                {
                        seconds++;
                        if(left)
                        {
                            x = x - 50;
                        }
                        else if(right)
                        {
                            x = x + 50;
                        }
                        else if(up)
                        {
                            y = y - 50;
                        }
                        else if(down)
                        {
                            y = y + 50;
                        }
                        head.setBounds(x,y,50,50);

                        headX[seconds] = x;
                        headY[seconds] = y;

                if(x == jbx && y == jby)
                {
                        remove(tokenJB);
                        randomAddX = (int)(Math.random() * 17);
                        jbx = 25 + randomAddX*50;
                        randomAddY = (int)(Math.random() * 11);
                        jby = 150 + randomAddY*50;
                        tokenJB.setBounds(jbx,jby,50,50);
                        add(tokenJB);
                        score++;
                        scoreJL.setText("Score: " + score);
                        add(tail[score]);
                }

                for(int i = 1; i <= score; i++)
                {
                        tail[i].setBounds(headX[seconds-i],headY[seconds-i],50,50);
                }
                
                if(x < 25 || x > 874 || y < 150 || y > 749)
                {
                        add(endJL);
                        endJL.setText("Game Over!");
                        scoreJL.setForeground(Color.red);
                        tim.stop();
                        sp.setHighScores(score, name);
                }
                
                for(int i = 1; i <=score; i++)
                {
                    if(x == headX[seconds - i] && y == headY[seconds - i])
                    {
                        add(endJL);
                        endJL.setText("Game Over!");
                        scoreJL.setForeground(Color.red);
                        tim.stop();
                        sp.setHighScores(score , name);
                    }
                }
                repaint();
            }
        }
        
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for(int i = 25; i < 850; i+=100)
            {
                for(int j = 150; j <750; j+=50)
                {
                    if(j % 100 == 0)
                    {
                        Color navy = new Color(0,51,102);
                        g.setColor(navy);
                        g.fillRect(i,j,50,50);
                    }
                    else
                    {
                        Color skyBlue = new Color(0,76,153);
                        g.setColor(skyBlue);
                        g.fillRect(i,j,50,50);
                    }
                }
            }
            for(int i = 75; i < 850; i+=100)
            {
                for(int j = 150; j <750; j+=50)
                {
                    if(j % 100 == 0)
                    {
                        Color skyBlue = new Color(0,76,153);
                        g.setColor(skyBlue);
                        g.fillRect(i,j,50,50);
                    }
                    else
                    {
                        Color navy = new Color(0,51,102);
                        g.setColor(navy);
                        g.fillRect(i,j,50,50);
                    }
                }
            }
            requestFocusInWindow();
        }
}
