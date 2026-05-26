import java.applet.*;
import java.awt.*;
public class ParamDemo2 extends Applet
{
	String username;
	public void init()
	{
		username=getParameter("UN");	
	}
	public void paint(Graphics g)
	{	
		g.drawString("username is : "+username,50,60);
		g.drawString("number of characters are : "+username.length(),50,80);
	}
}
/*<applet code="ParamDemo2" width=500 height=400>
<param name="UN" value="suraj mude">
</applet>*/