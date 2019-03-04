
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AICreate {

	public static void main(String[] args) {
AIPainter painter = new AIPainter();
AIModules modules = new AIModules(10, "", 10);
JFrame AIF = new JFrame("AICreator");
AIF.add(painter);
AIF.setExtendedState(Frame.MAXIMIZED_BOTH);
FlowLayout layout = new FlowLayout();
painter.setLayout(layout);
JButton paint = new JButton(painter.name);
painter.add(paint);
JTextField question = new JTextField();
question.setBackground(Color.WHITE);
question.setEditable(true);
question.setColumns(40);
painter.add(question);
JButton go = new JButton("go");
painter.add(go);
go.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
paint.setText(modules.askQuestion(question.getText()));
	}
});
paint.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		painter.upName();
		painter.repaint();
		paint.setText(painter.name);
	}

});
AIF.setVisible(true);
	}

}
