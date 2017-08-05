import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	public myJFrame ()
	{
		super ("Penn State Snake");
		try
                {
                    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                } 
                
                myJPanel mjp = new myJPanel();
                add(mjp);    
                
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (900,800);
                setResizable(false);
		setVisible(true);
	}
        
}
