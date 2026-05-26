import java.applet.*;
import java.awt.*;
public class NameColor extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.orange);
		Font f1=new Font("Georgia",Font.ITALIC,35);
		Color c1=new Color(223,23,54);
		g.setFont(f1);
		g.setColor(c1);
		g.drawString("Suraj Vivekrao Mude ",20,80);
			
		Font f2=new Font("jokerman",Font.BOLD,35);
		Color c2=new Color(43,114,63);
		g.setFont(f2);
		g.setColor(c2);
		g.drawString("Suraj Vivekrao Mude",20,110);

		Font f3=new Font("chiller",Font.PLAIN,35);
		Color c3=new Color(115,114,63);
		g.setFont(f3);
		g.setColor(c3);
		g.drawString("Hey Suraj !!! I been looking for you !!",20,140);

		Font f4=new Font("ravie",Font.PLAIN+Font.ITALIC,35);
		Color c4=new Color(43,34,153);
		g.setFont(f4);
		g.setColor(c4);
		g.drawString("pleased to meet you!!",20,170);
		
	}
}
/*<applet code="NameColor.java" width=600 height=300></applet>*/