import java.applet.*;
import java.awt.*;
public class ParamDemo6 extends Applet
{
	int side;
	public void init()
	{
		side=Integer.parseInt(getParameter("SIDE"));
	}
	public void paint(Graphics g)
	{
		g.drawString("area of square is : "+(side*side),40,60);
		g.drawString("perimeter of rectangle is : "+(4*side),40,80);
	}
}
/*<applet code="ParamDemo6.java" width=400 height=400>
<param name="SIDE" value="24">
</applet>*/