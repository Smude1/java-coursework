import java.awt.*;
import java.applet.*;
public class AppletPra extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.gray);
		g.drawLine(20,20,100,20);
	}
}
/*<applet code="AppletPra.java" width=500 height=500></applet>*/