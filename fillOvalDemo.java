import java.applet.*;
import java.awt.*;
public class fillOvalDemo extends Applet
{
	int x1,y1,w,h;
	public void init()
	{
		setBackground(Color.gray);
		x1=40;
		y1=40;
		w=300;
		h=280;	
	}
	public void paint(Graphics g) 
	{
		int r=22,g1=44,b=55;
		try
		{
		for(int i=1;i<=7;i++)
		{
			Thread t1=new Thread(Thread.currentThread());
			t1.sleep(200);
			Color c1=new Color(r,g1,b);
			g.setColor(c1);
			g.fillOval(x1,y1,w,h);
			x1=x1+30;
			y1=y1+30;
			w=w-60;
			h=h-60;
			r=r+45;
			g1=g1+52;
			b=b+34;

			
		}
		}
		catch(Exception e){}
	}
}
/*<applet code="fillOvalDemo.java" width=400 height=400></applet>*/