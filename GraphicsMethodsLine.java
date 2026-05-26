import java.applet.*;
import java.awt.*;
public class GraphicsMethodsLine extends Applet
{
	int x1,y1,w,h,i;
	public void init()
	{
		setBackground(Color.orange);
		x1=20;
		y1=20;
		w=360;
		h=280;
	}
	public void paint(Graphics g)
	{
		g.fillRect(x1,y1,w,h);
	}
}
/*<applet code="GraphicsMethodsLine.java" width=400 height=350></applet>*/