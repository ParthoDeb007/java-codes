//5.27
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shape extends JPanel
{
   private final int choice;

   public Shape(int userChoice)
   {
	  choice = userChoice;
   } 
   public void paintComponent(Graphics g)
   {
	  super.paintComponent(g);
	  
	  for (int i = 0; i < 10; i++)
	  {
		 switch (choice)
		 {
			case 1:
			   g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
			   break;
			case 2: 
			   g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
			   break;
			default:
			 
			   break;
		 } 
	  } 
   } 
}
