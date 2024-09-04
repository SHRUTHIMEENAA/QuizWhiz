package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

   JButton rules;
   JButton back;
   JTextField tfname;

   Login() 
   {
	   //to add img
      this.getContentPane().setBackground(Color.BLACK);
      this.setLayout(null);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
      JLabel image = new JLabel(i1);
      image.setBounds(0, 0, 600, 600);
      this.add(image);
      
      //to add the heading
      JLabel heading = new JLabel("Welcome To QuizWhiz");
      heading.setBounds(750, 60, 300, 45);
      heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
      heading.setForeground(Color.white);
      this.add(heading);
      
      //to display enter your name 
      JLabel name = new JLabel("Enter Your Good Name");
      name.setBounds(810, 150, 300, 20);
      name.setFont(new Font("Mongolian Baiti", 1, 18));
      name.setForeground(Color.LIGHT_GRAY);
      this.add(name);
      
      //to get input
      this.tfname = new JTextField();
      this.tfname.setBounds(735, 200, 300, 25);
      this.tfname.setFont(new Font("Times New Roman", 1, 20));
      this.add(this.tfname);
      
      //to create buttons
      this.rules = new JButton("Rules");
      this.rules.setBounds(735, 270, 120, 25);
      this.rules.setBackground(new Color(138, 43, 226));
      this.rules.setForeground(Color.WHITE);
      this.rules.addActionListener(this);
      this.add(this.rules);
      this.back = new JButton("Back");
      this.back.setBounds(915, 270, 120, 25);
      this.back.setBackground(new Color(138, 43, 226));
      this.back.setForeground(Color.WHITE);
      this.back.addActionListener(this);
      this.add(this.back);
      
      
      this.setSize(1200, 500);
      this.setLocation(200, 150);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == this.rules) {
         String name = this.tfname.getText();
         this.setVisible(false);
         new Rules(name);
      } else if (ae.getSource() == this.back) {
         this.setVisible(false);
      }

   }

   public static void main(String[] args) {
      new Login();
   }
}
