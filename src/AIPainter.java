
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JPanel;

public class AIPainter extends JPanel{
	{
		super.setBackground(Color.BLACK);
	}
Random rand = new Random();
Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
char[] letterNums = "abcdefghijklmnoopqrstuvwxyz1234567890".toCharArray();
public String generateName() {
String name = "";
for(int i = 0; i < rand.nextInt(10)+1; i++) {
name = name+letterNums[rand.nextInt(36)];
}
return name;
}
public AIPainter() {

}
public String name = generateName();
public void upName() {
name = generateName();
}
}
