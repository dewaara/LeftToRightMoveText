/* DEVELOPER NAME:- MD.HALIM 
 Copyright Dewaara Inc. 12/02/2020 01:45 PM
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
<applet code="East" width=400 height=150>
</applet>
*/

public class East extends JPanel {
    int x = 0, y = 100;

	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 =(Graphics2D)g;
		Font font = new Font("Tahona",Font.BOLD+Font.PLAIN,100);
		g2.setFont(font);
		g2.setColor(Color.red);
		g2.drawString("MD.HALIM",x,y);
		
		try{Thread.sleep(100);}catch(Exception ex){}
		x+=10;
		if(x>this.getWidth())
		{
			x=0;
		}
		repaint();
	}
  
    public static void main(String[] args) 
    {   
	JFrame jf = new JFrame("Dewaara Inc.");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(700,200);
        jf.add(new East());
        jf.setVisible(true);
    }
}
