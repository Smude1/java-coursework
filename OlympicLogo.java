import java.applet.*;
import java.awt.*;
public class OlympicLogo extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.orange);
		x1=100;
		y1=80;
		w=180;
		h=180;	
	}
	public void paint(Graphics g) 
	{
		for(i=1;i<=5;i++)
		{
			g.drawOval(x1,y1,w,h);
			x1=x1+130;
			if(i==3)
			{	
				x1=x1-330;
				y1=y1+130;
				g.drawOval(x1,y1,w,h);
				
			}
		}
	}
}
/*<applet code="OlympicLogo.java" width=700 height=500></applet>*/