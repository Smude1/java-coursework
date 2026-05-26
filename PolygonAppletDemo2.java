import java.applet.*;
import java.awt.*;
public class PolygonAppletDemo2 extends Applet
{
	int x1[]={200,250,230,180,155,200};
	int y1[]={200,250,300,300,255,200};
	public void paint(Graphics g)
	{
		setBackground(Color.pink);
		g.drawPolygon(x1,y1,x1.length);
		
	}
}
/*<applet code="PolygonAppletDemo2.java" width=400 height=400></applet>*/