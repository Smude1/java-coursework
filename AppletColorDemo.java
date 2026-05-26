import java.applet.*;
import java.awt.*;
public class AppletColorDemo extends Applet
{
	public void init()
	{
		Color c1=new Color(144,23,23);
		Color c2=new Color(0.5f,0.14f,0.89f);
		setBackground(c1);
		setForeground(c2);
		//setBackground(Color.pink);
		//setForeground(Color.white);
	}
	public void paint(Graphics g)
	{
		g.drawString("hello there suraj ! ",40,50);
	}
}
/*<applet code="AppletColorDemo.java" width=400 height=400></applet>*/