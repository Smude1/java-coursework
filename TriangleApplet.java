import java.applet.*;
import java.awt.*;
public class TriangleApplet extends Applet
{
	public void paint(Graphics g)
	{
		int x[]={20,70,35,20};
		int y[]={20,20,50,20};
		
		g.drawPolygon(x,y,x.length);
	}
}
/*<applet code="TriangleApplet.java" width=300 height=300></applet>*/