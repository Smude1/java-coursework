import java.applet.*;
import java.awt.*;
public class GraphicsMethodsRect extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.orange);
		setForeground(Color.black);
		x1=20;
		y1=20;
		w=360;
		h=280;
	}
	public void paint(Graphics g)
	{	
		Font f1=new Font("arial",Font.BOLD,30);
		g.setFont(f1);
		for(i=1;i<=5;i++)
		{
			g.drawRect(x1,y1,w,h);
			x1=x1+30;
			y1=y1+30;
			w=w-60;
			h=h-60;		
		}
	}
}
/*<applet code="GraphicsMethodsRect.java" width=400 height=350></applet>*/