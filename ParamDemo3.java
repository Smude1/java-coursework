import java.applet.*;
import java.awt.*;
public class ParamDemo3 extends Applet
{
	String accno;
	int bal;
	public void init()
	{
		accno=getParameter("ACC");
		bal=Integer.parseInt(getParameter("BAL"));
	}
	public void paint(Graphics g)
	{
		g.drawString("account no. is  :"+accno,40,40);
		g.drawString("balance is  :"+bal,40,60);
		if(bal<500)
		{
			g.drawString("your balance is low : "+bal,40,80);
		}
		else
		{
			g.drawString("sufficient balance : "+bal,50,40);
		}
	}
}
/*<applet code="ParamDemo3.java" width=500 height=400>
<param name= "ACC" value ="m23546224">
<param name= "BAL" value ="450">	
</applet>*/
