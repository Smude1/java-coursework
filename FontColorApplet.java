import java.applet.*;
import java.awt.*;
public class FontColorApplet extends Applet
{
	public void paint(Graphics g)
	{
		Font f1=new Font("georgia",Font.PLAIN+Font.ITALIC,20);
		g.setFont(f1); 	//should be written to set the font's customization
		g.setColor(Color.black);
		g.drawString("suraj! i been looking for you !!",20,40);

		g.drawString("font's information : "+g.getFont(),20,70);
		g.drawString("Font's color information : "+g.getColor(),20,100);

		//below methods shows font's name ,style ,size
		g.drawString("the name of the font is : "+f1.getFontName(),20,130);
		g.drawString("it dosn't returns name of the style but it returns its value :"+f1.getStyle(),40,160);
		g.drawString("size of the font is : "+f1.getSize(),40,190);

		//the given methods returns true or falase is font's style is checked
		g.drawString("is my font's style is Italic ?? : "+f1.isItalic(),40,220);
		g.drawString("is my font's style is bold ?? : "+f1.isBold(),40,240);
		g.drawString("is my font's style is plain ?? : "+f1.isPlain(),40,260);
		
	}
}
/*<applet code="FontColorApplet.java" width=800 height=500></applet>*/