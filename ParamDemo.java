import java.applet.*;
import java.awt.*;
public class ParamDemo extends Applet
{
	String username;
	public void init()
	{
		username=getParameter("UN");
	}
	public void paint(Graphics g)
	{
		g.drawString("hello "+username,40,50);
	}
}
/*<applet code="ParamDemo.java" width=500 height=400>
<param name="UN" value="Suraj">
</applet>*/	