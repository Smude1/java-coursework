import java.applet.*;
import java.awt.*;
public class NameApplet extends Applet
{
	int r,g1,b,x,y;
	public void init()
	{
		r=255;
		g1=80;
		b=200;
		x=50;
		y=60;
	}
	public void paint(Graphics g)  
	{
		
		Thread t1=new Thread(Thread.currentThread());
		try
		{
			Font f1=new Font("default",Font.PLAIN,40);
			g.setFont(f1);
			for(int i=0;i<10;i++)
			{
				Color c1=new Color(r,g1,b);
				g.setColor(c1);
				g.drawString("suraj",x,y);
				t1.sleep(2000);
				r=r-15;
				g1=g1+15;
				b=b-15;
			}
		}
		catch(Exception e)		
		{
		}
	}
}
/*<applet code="NameApplet.java" width=500 height=300></applet>*/