import java.applet.*;
import java.awt.*;
public class PolygonAppletDemo1 extends Applet
{
	int x1[]={100,300,340,300,100,60,100};
	int y1[]={100,100,145,200,200,145,100};
	public void paint(Graphics g)
	{
		setBackground(Color.pink );
		g.drawPolygon(x1,y1,x1.length);
		
	}
}
/*<applet code="PolygonAppletDemo1.java" width=400 height=400></applet>*/