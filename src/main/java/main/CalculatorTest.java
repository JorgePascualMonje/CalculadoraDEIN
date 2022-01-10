/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Alumno Tarde
 */
public class CalculatorTest implements ActionListener{
    int o,n;
    String s1,s2,s3,s4,s5;
    Frame f;
    Panel p;
    Panel display;
    Panel number;
    Panel operations;
    TextField tf;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    CalculatorTest(){
        f = new Frame("Clculadora");
        p = new Panel(new BorderLayout(1, 10));
        f.setLayout(new FlowLayout());
        display = new Panel();
        tf = new TextField(20);
        tf.setEditable(false);
        p.add(tf, BorderLayout.NORTH);
        number = new Panel(new GridLayout(4,3,5,5));
        b1 = new Button("0");
        b1.addActionListener(this);
        b2 = new Button("1");
        b2.addActionListener(this);
        b3 = new Button("2");
        b3.addActionListener(this);
        b4 = new Button("3");
        b4.addActionListener(this);
        b5 = new Button("4");
        b5.addActionListener(this);
        b6 = new Button("5");
        b6.addActionListener(this);
        b7 = new Button("6");
        b7.addActionListener(this);
        b8 = new Button("7");
        b8.addActionListener(this);
        b9 = new Button("8");
        b9.addActionListener(this);
        b10 = new Button("9");
        b10.addActionListener(this);
        number.add(b10);number.add(b9);number.add(b8);number.add(b7);number.add(b6);
        number.add(b5);number.add(b4);number.add(b3);number.add(b2);number.add(b1);
        p.add(number, BorderLayout.WEST);
        operations = new Panel(new GridLayout(5,1,5,5));
        b11 = new Button("+");
        b11.addActionListener(this);
        b12 = new Button("-");
        b12.addActionListener(this);
        b13 = new Button("*");
        b13.addActionListener(this);
        b14 = new Button("/");
        b14.addActionListener(this);
        b15 = new Button("=");
        b15.addActionListener(this);
        operations.add(b11);operations.add(b12);operations.add(b13);
        operations.add(b14);operations.add(b15);
        p.add(operations, BorderLayout.EAST);
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
        }if(e.getSource()==b4)
        {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b10)
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b11)
        {
            s1 = tf.getText();
            tf.setText("");
            o=1;
 
        }
        if(e.getSource()==b12)
        {
            s1 = tf.getText();
            tf.setText("");
            o=2;
 
        }
        if(e.getSource()==b13)
        {
            s1 = tf.getText();
            tf.setText("");
            o=3;
 
        }
        if(e.getSource()==b14)
        {
            s1 = tf.getText();
            tf.setText("");
            o=4;
 
        }
        if(e.getSource()==b15)
        {
            s2 = tf.getText();
            if(o==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(o==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(o==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            if(o==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
                    tf.setText(String.valueOf(n));
                     }
                     else
                        tf.setText("ERROR");
 
                }
                catch(Exception i){}
            }
        }
    }
    public static void main(String[] abc){
        CalculatorTest v = new CalculatorTest();
    }
}