import java.applet.*;
import java.awt.*;
public class PolygonAppletDemo extends Applet
{
	int x1[]={270,200,40,270};
	int y1[]={80,400,320,80};

	int x2[]={270,200,380,270};
	int y2[]={80,400,380,80};
	public void paint(Graphics g)
	{
		g.drawPolygon(x1,y1,x1.length);
		g.fillPolygon(x2,y2,x2.length);
	}
}
/*<applet code="PolygonAppletDemo.java" width=400 height=400></applet>*/