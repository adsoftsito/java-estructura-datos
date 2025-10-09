import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class ButtonDemo extends JApplet implements ActionListener

{

JButton b1,b2;

public void init()

{

Container c=getContentPane();

c.setLayout(new FlowLayout(FlowLayout.CENTER));

b1=new JButton("yes");

b2=new JButton("no");

c.add(b1);

c.add(b2);

b1.addActionListener(this);

b2.addActionListener(this);

}

public void actionPerformed(ActionEvent e)

{

showStatus(e.getActionCommand());

}

}


