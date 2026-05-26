import java.applet.*;
import java.awt.*;
public class OvalDemo extends Applet
{
	int x1,y1,w,h;
	public void init()
	{
		x1=40;
		y1=40;
		w=300;
		h=280;	
	}
	public void paint(Graphics g)
	{
		for(int i=1;i<=5;i++)
		{
			g.drawOval(x1,y1,w,h);
			x1=x1+30;
			y1=y1+30;
			w=w-60;
			h=h-60;
		}
	}
}
/*<applet code="OvalDemo.java" width=400 height=350></applet>*/