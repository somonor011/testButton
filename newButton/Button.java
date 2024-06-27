package newButton;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame{
   
     Button(){
         JButton btn1 = new JButton();
         btn1.setBounds(10, 300, 200, 100);// កំណត់គម្លាត x,y និង កំណត់ទំហំ width, height
         btn1.setText("Button demo");
         btn1.setFocusable(false); // លុប border

         JButton btn2 = new JButton();
         btn2.setBounds(210, 300, 200, 100);
         btn2.setText("Hello world");
         btn2.setFocusable(false);
         btn2.setBackground(Color.GREEN);

         JButton btn3 = new JButton();
         btn3.setBounds(410, 300, 200, 100);
         btn3.setText("Welcome to Java");
         btn3.setFocusable(false);

         JButton btn4 = new JButton();
         btn4.setBounds(610, 300, 200, 100);
         btn4.setText("Program");
         btn4.setFocusable(false);

         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         this.setSize(1000, 500);
         this.setLayout(null);
         this.add(btn1);
         this.add(btn2);
         this.add(btn3);
         this.add(btn4);
     }
       
    
}
