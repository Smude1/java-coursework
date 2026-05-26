import java.applet.*;
import java.awt.*;
public class ParamDemo1 extends Applet 
{
	String fn,mn,ln;
	String flnm;
	public void init()
	{
		fn=getParameter("FN");
		mn=getParameter("MN");
		ln=getParameter("LN");
		flnm=fn+" "+mn+" "+ln;
	}
	public void paint(Graphics g)
	{
		g.drawString("full name is : "+flnm,50,60);
	}
}
/*<applet code="ParamDemo1" width=500 height=400>
<param name="FN" value="Suraj">
<param name="MN" value="vivekrao">
<param name="LN" value="mude">
</applet>*/