import java.applet.*;
import java.awt.*;
public class RoundRect extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.orange);
		setForeground(Color.black);
		x1=20;
		y1=20;
		w=290;
		h=290;
	}
	public void paint(Graphics g)
	{	
		for(i=1;i<=5;i++)
		{
			g.drawRoundRect(x1,y1,w,h,24,30);
			x1=x1+30;
			y1=y1+30;
			w=w-60;
			h=h-60;		
		}
	}
}
/*<applet code="RoundRect.java" width=600 height=450></applet>*/