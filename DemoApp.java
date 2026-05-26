import java.applet.*;
import java.awt.*;
public class DemoApp extends Applet
{
	int rollno;
	String name;
	double per;
	public void init()
	{
		System.out.println("im from init method ");
		rollno=111;
		name="Suraj";
		per=83.67;
	}
	public void start()
	{
		System.out.println("im from start method");
	}
	public void paint(Graphics g)
	{
		g.drawString("roll  number is : "+rollno,30,40);
		g.drawString("name is : "+name,30,60);
		g.drawString("percentage is : "+per,30,80);
	}
	public void stop()
	{
		System.out.println("now im at idle state : ");
	}
	public void destroy()
	{
		System.out.println("im gonna destroy,and gonna take rebirth");
	}
}
/*<applet code="DemoAplet.java" width=400 height=350></applet>*/