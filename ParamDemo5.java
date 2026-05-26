import java.applet.*;
import java.awt.*;
public class ParamDemo5 extends Applet
{
	int length,breadth;
	public void init()
	{
		length=Integer.parseInt(getParameter("LEN"));
		breadth=Integer.parseInt(getParameter("BRE"));
	}
	public void paint(Graphics g)
	{
		g.drawString("area of rectangle is : "+(length*breadth),40,60);
		g.drawString("perimeter of rectangle is : "+(2*(length*breadth)),40,80);
	}
}
/*<applet code="ParamDemo5.java" width=400 height=400>
<param name="LEN" value="6">
<param name="BRE" value="12">
</applet>*/