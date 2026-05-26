import java.applet.*;
import java.awt.*;
public class GraphicsMethodsDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(20,20,350,20);
		g.drawLine(20,50,350,50);
	}
}
/*<applet code="GraphicsMethodsDemo.java" width=400 height=350></applet>*/