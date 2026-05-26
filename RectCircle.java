import java.applet.*;
import java.awt.*;
public class RectCircle extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.gray);
		x1=100;
		y1=80;
		w=300;
		h=300;	
	}
	public void paint(Graphics g) 
	{
		g.drawRect(x1,y1,w,h);
		g.drawOval(x1,y1,w,h);
	}
}
/*<applet code="RectCircle.java" width=500 height=400></applet>*/