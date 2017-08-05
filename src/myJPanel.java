import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class myJPanel extends JPanel implements ActionListener
{
        homePanel hp;
        optionsPanel op;
        gamePanel gp;
        instructionsPanel ip;
        designerPanel dp;
        scoresPanel sp;
   
        public myJPanel ()
        {
                
                super();
                setLayout(new GridLayout(1,1));
                
                hp = new homePanel();
                add(hp);
                sp = new scoresPanel();
                gp = new gamePanel(sp);
                op = new optionsPanel(gp);
                ip = new instructionsPanel();
                dp = new designerPanel();

                hp.startJB.addActionListener(this);
                hp.instructionsJB.addActionListener(this);
                hp.designerJB.addActionListener(this);
                hp.scoresJB.addActionListener(this);
                op.homeJB.addActionListener(this);
                op.playJB.addActionListener(this);
                gp.homeJB.addActionListener(this);
                ip.homeJB.addActionListener(this);
                dp.homeJB.addActionListener(this);
                sp.homeJB.addActionListener(this);

	}
        
        public void actionPerformed(ActionEvent event)
        {
            Object obj = event.getSource();
            if(obj == hp.startJB)
            {
                remove(hp);
                add(op);
            }
            else if(obj == hp.instructionsJB)
            {
                remove(hp);
                add(ip);
            }
            else if(obj == hp.designerJB)
            {
                remove(hp);
                add(dp);
            }
            else if(obj == hp.scoresJB)
            {
                remove(hp);
                add(sp);
            }
            if(obj == op.playJB)
            {
                remove(op);
                add(gp);
                String typedName = op.nameTF.getText();
                gp.getName(typedName);
                gp.tim.start();
            }
            if(obj == op.homeJB  || obj == gp.homeJB || obj == ip.homeJB || obj == dp.homeJB || obj == sp.homeJB)
            {
                remove(op);
                remove(ip);
                remove(dp);
                remove(gp);
                remove(sp);
                gp = new gamePanel(sp);
                op = new optionsPanel(gp);
                hp.startJB.addActionListener(this);
                hp.instructionsJB.addActionListener(this);
                hp.designerJB.addActionListener(this);
                hp.scoresJB.addActionListener(this);
                op.homeJB.addActionListener(this);
                op.playJB.addActionListener(this);
                gp.homeJB.addActionListener(this);
                ip.homeJB.addActionListener(this);
                dp.homeJB.addActionListener(this);
                sp.homeJB.addActionListener(this);
                add(hp);                
            }
            validate();
            repaint();
        }
        
}