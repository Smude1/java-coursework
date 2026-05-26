import java.applet.*;
import java.awt.*;
public class UnameAppletDemo extends Applet
{
	String pass,uname;
	public void print(Graphics g)
	{
		setBackground(Color.black);
		//uname=getParameter("un");
		//g.drawString("user name is : "+uname,20,20);
		pass=getParameter("upass");
		int n=pass.length();
		if(n>8)
		{
			g.drawString("entered password is : "+pass,20,40);
		}
		else
		{
			g.drawString("password should have characters above 8",20,40);
		}
	}
}
/*<applet code="UnameAppletDemo.java" width=400 height=400>
//<param name="un" value="Surajmude1">
<param name="upass" value="134232222">
</applet>*/

