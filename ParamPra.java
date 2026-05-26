import java.applet.*;
import java.awt.*;
public class ParamPra extends Applet
{
	String name,m,l,fl;
	public void init()
	
		setBackground(Color.gray);
		name=getParameter("dem");
		m=getParameter("dem1");
		l=getParameter("dem2");
		fl=name+m+l;
	}
	public void paint(Graphics g)
	{
		g.drawRect(35,35,130,40);
		g.drawString(""+fl,40,50);
	}
}
/*<applet code="ParamPra.java" width=400 height=400>
<param name="dem" value="Suraj">
<param name="dem1" value=" vivekrao">
<param name="dem2" value=" mude">
</applet>*/