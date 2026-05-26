import java.applet.*;
import java.awt.*;
public class ParamDemo4 extends Applet
{
	int radius;
	public void init()
	{
		radius=Integer.parseInt(getParameter("RAD"));
	}
	public void paint(Graphics g)
	{
		g.drawString("area of circle is : "+(3.14*(radius*radius)),40,60);
		g.drawString("circumfurence of circle is : "+(2*(3.14*radius)),40,80);
	}
}
/*<applet code="ParamDemo4.java" width=400 height=400>
<param name="RAD" value="12">
</applet>*/