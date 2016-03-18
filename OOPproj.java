import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class AirHockeyGame extends Applet implements ActionListener
{
	Button Play, Help;
	Image Img;
	Font Heading, Font_others;
	TextField PlayerField, IPField;
	
	//Initializing prerequisites
	public void init()
	{
		Img = getImage(getDocumentBase(),"airhockey.jpg");
		
		Heading = new Font("TimesRoman", Font.BOLD, 40);
		Font_others = new Font("TimesRoman", Font.BOLD, 18);
		
		PlayerField = new TextField(20);
		PlayerField.setBackground(Color.white);
		PlayerField.setFont(Font_others);
		
		IPField = new TextField(20);
		IPField.setBackground(Color.white);
		IPField.setFont(Font_others);
		
		Play = new Button("PLAY");
		Play.addActionListener(this);
		Play.setFont(Font_others);
		
		Help = new Button("HELP");
		Help.addActionListener(this);
		Help.setFont(Font_others);
		
		add(PlayerField);
		add(IPField);
		add(Play);
		add(Help);
		
		Play.setBackground(Color.lightGray);
		Help.setBackground(Color.lightGray);
	}
	
	//Response to click
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() == Play)
		{
			Play.setBackground(Color.yellow);
			Help.setBackground(Color.lightGray);
		}
      
		if(e.getSource() == Help)
		{
			Help.setBackground(Color.yellow);
			Play.setBackground(Color.lightGray);
		}
	}
	
	//For Positioning and Formatting
	public void paint(Graphics g)
	{
		setLayout(null);
		int height = getHeight();
		int width = getWidth();
		g.drawImage(Img, 0, 0, width, height, this);
		
		g.setFont(Heading);
		g.setColor(Color.white);
		g.drawString("Air Hockey 2K16", width/2 - 180, 100);
		
		g.setFont(Font_others);
		
		g.drawString("Username :", 450, 200);
		PlayerField.setLocation(590, 180);
		
		g.drawString("Connect to (IP) :", 400, 280);
		IPField.setLocation(590,260);
		
		Play.setLocation(width/2 - 60, 350);
		Play.setSize(120, 60);
		
		Help.setLocation(width/2 - 60, 430);
		Help.setSize(120, 60);
	}
}
