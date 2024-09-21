import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.awt.event.*;
class Myframe extends JFrame implements ActionListener{
      private Container c;
      private JLabel label1,label2;
      private JTextField t1,t2;
      private JButton add,sub,mul,div;
      private JLabel nameLabel,result;
Myframe(){
    setTitle("Simple Calculator");
    setSize(400,300);
    setLocation(100,100);
    setLocation(10,100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    c=getContentPane();
    c.setLayout(null);
    c.setBackground(Color.YELLOW);

    Font font1 = new Font("Arial", Font.BOLD, 15);

    nameLabel = new JLabel("By : Ankit Mishra", JLabel.CENTER);
    nameLabel.setBounds(40, 5, 300, 20); // Top center position
    nameLabel.setFont(new Font("Verdana", Font.BOLD, 18));
    c.add(nameLabel);

    label1=new JLabel("First Number : ");
    label1.setBounds(50,40,150,30);
    label1.setFont(font1);
    c.add(label1);
    t1=new JTextField();
    t1.setBounds(200,40,120,30);
    t1.setFont(font1);
    c.add(t1);

    label2=new JLabel("Seconed Number : ");
    label2.setBounds(50,80,150,30);
    label2.setFont(font1);
    c.add(label2);
    t2=new JTextField();
    t2.setBounds(200,80,120,30);
    t2.setFont(font1);
    c.add(t2);

    Font font = new Font("Arial", Font.BOLD, 24);

    add=new JButton("+");
    add.setBounds(50,135,60,30);
    add.setBackground(Color.white);
    add.setForeground(Color.BLACK);
    add.setFont(font);
    c.add(add);

    sub=new JButton("-");
    sub.setBounds(200,135,60,30);
    sub.setBackground(Color.white);
    sub.setForeground(Color.BLACK);
    sub.setFont(font);
    c.add(sub);

    mul=new JButton("X");
    mul.setBounds(50,185,60,30);
    mul.setBackground(Color.white);
    mul.setForeground(Color.BLACK);
    mul.setFont(font);
    c.add(mul);

    div=new JButton("/");
    div.setBounds(200,185,60,30);
    div.setBackground(Color.white);
    div.setForeground(Color.BLACK);
    div.setFont(font);
    c.add(div);

    result =new JLabel("Result : ");
    result.setBounds(50,235,200,20);
    result.setFont(font1);
    c.add(result);
    
    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);

    setVisible(true);
}
public void actionPerformed(ActionEvent e){
try{
    if(e.getSource()==add){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        result.setText("Result : "+c);  // iska mtlb previous result => Result : c me badal jayega
    }

    if(e.getSource()==sub){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a-b; 
        result.setText("Result : "+c);     
    }

    if(e.getSource()==mul){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a*b; 
        result.setText("Result : "+c);     
    }

    if(e.getSource()==div){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a/b; 
        result.setText("Result : "+c);     
    }
}catch(NumberFormatException e1){
   result.setText("Please enter Integer Value");
}catch(ArithmeticException e2){
    result.setText("Cannot divide by Zero");
}
}
}
public class calculator {
    public static void main(String[] args) {
        Myframe frame=new Myframe();
    }
    
}
