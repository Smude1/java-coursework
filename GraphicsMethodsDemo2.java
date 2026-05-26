import java.applet.*;
import java.awt.*;
public class GraphicsMethodsDemo2 extends Applet
{
	int x1,y1,x2,y2,i;
	public void init()
	{
		setBackground(Color.orange);
		setForeground(Color.black);
		x1=20;
		y1=20;
		x2=20;
		y2=300;
	}
	public void paint(Graphics g)
	{	
		Font f1=new Font("arial",Font.BOLD,30);
		g.setFont(f1);
		for(i=1;i<=5;i++)
		{
			g.drawLine(x1,y1,x2,y2);
			x1=x1+30;
			x2=x2+30;		
		}
	}
}
/*<applet code="GraphicsMethodsDemo2.java" width=400 height=350></applet>*/