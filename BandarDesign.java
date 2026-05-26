import java.applet.*;
import java.awt.*;
public class BandarDesign extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.orange);
		x1=100;
		y1=50;
		w=350;
		h=350;	
	}
	public void paint(Graphics g) 
	{
		g.drawOval(x1,y1,w,h);
		g.drawOval(180,130,60,60);
		g.drawOval(320,130,60,60);
		g.fillOval(195,145,30,30);
		g.fillOval(335,145,30,30);

		g.drawOval(27,145,75,180);
		g.drawOval(449,145,75,180);
		g.drawOval(265,220,30,30);

		g.drawArc(170,110,80,70,35,120);
		g.drawArc(310,110,80,70,35,120);
		g.drawArc(210,200,150,80,0,180);
		g.drawArc(180,400,200,80,0,-180);
		
		g.fillArc(210,235,150,115,180,180);

		g.drawLine(230,395,230,473);
		g.drawLine(315,395,315,475);

		Font f1=new Font("ink free",Font.ITALIC,28);
		g.setFont(f1);
		g.drawString("it seems like Monkey :-)",390,410);
		
	}
}
/*<applet code="BandarDesign.java" width=700 height=500></applet>*/