package EmployeeManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame {

    Splash() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Splash();
    }
}