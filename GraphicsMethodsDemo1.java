import java.applet.*;
import java.awt.*;
public class GraphicsMethodsDemo1 extends Applet
{
	int x1,y1,x2,y2,i;
	public void init()
	{
		setBackground(Color.gray);
		setForeground(Color.black);
		x1=20;
		y1=20;
		x2=350;
		y2=20;
	}
	public void paint(Graphics g)
	{	
		Font f1=new Font("arial",Font.BOLD,30);
		g.setFont(f1);
		for(i=1;i<=10;i++)
		{
			g.drawLine(x1,y1,x2,y2);
			y1=y1+30;
			y2=y2+30;		
		}
	}
}
/*<applet code="GraphicsMethodsDemo1.java" width=400 height=350></applet>*/