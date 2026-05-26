import java.applet.*;
import java.awt.*;
public class GraphicsMethodsRect2 extends Applet
{
	int i;
	int xh1,yh1,xh2,yh2;
	int xv1,yv1,xv2,yv2;
	public void init()
	{
		setBackground(Color.orange);
		setForeground(Color.black);
		xh1=130;
		yh1=130;
		xh2=400;
		yh2=130;

		xv1=130;
		yv1=130;
		xv2=130;
		yv2=400;
	}
	public void paint(Graphics g)
	{	
		Font f1=new Font("arial",Font.BOLD,30);
		g.setFont(f1);
		for(i=1;i<=10;i++)
		{
			g.drawLine(xh1,yh1,xh2,yh2);
			yh1=yh1+30;
			yh2=yh2+30;

			g.drawLine(xv1,yv1,xv2,yv2);
			xv1=xv1+30;
			xv2=xv2+30;
		}
		g.drawLine(85,85,450,450);
		g.drawLine(450,80,80,450);
		g.drawLine(265,65,265,500);
	}
}
/*<applet code="GraphicsMethodsRect2.java" width=600 height=450></applet>*/