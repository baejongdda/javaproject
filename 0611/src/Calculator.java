import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame {
public MyFrame3() {
setSize(230,300);
setTitle("°è»ê±â");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout(FlowLayout.LEFT));


JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();

JButton cal = new JButton("C");

p1.setLayout(new GridLayout(1,1,5,5));
p2.setLayout(new GridLayout(1,1,5,5));
p3.setLayout(new GridLayout(4,4,5,5));

JTextField text = new JTextField(25);

p1.add(text);
p2.add(cal);

String[] a = {
"7","8","9","/",
"4","5","6","+",
"1","2","3","-",
"0","+/-","=","+"
};

JButton[] button = new JButton[16];

for(int i=0; i<a.length; i++) {
button[i] = new JButton(a[i]);
p3.add(button[i]);
}

add(p1);
add(p2);
add(p3);

setVisible(true);
}
}

public class Calculator {
public static void main(String[] args) {
MyFrame3 f = new MyFrame3();
}
}