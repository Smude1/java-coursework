import java.applet.*;
import java.awt.*;
public class AppletParam extends Applet
{		
	String fn,sn,ln,fln;
	public void paint(Graphics g)
	{
		fn = getParameter("fsn");
		sn=getParameter("snm");
		ln=getParameter("lnm");
		fln=fn+sn+ln;
		g.drawString(fln,40,50);
	}
	
}
/*<applet code="AppletParam.java" width=400 height=400>
<param name="fsn" value="suraj">
<param name="snm" value=" vivekrao">
<param name="lnm" value=" mude">
</applet>*/