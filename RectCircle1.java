import java.applet.*;
import java.awt.*;
public class RectCircle1 extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.gray);
		x1=130;
		y1=110;
		w=280;
		h=280;	
	}
	public void paint(Graphics g) 
	{
		g.drawOval(70,50,400,400);
		g.drawRect(x1,y1,w,h);
	}
}
/*<applet code="RectCircle1.java" width=500 height=460></applet>*/