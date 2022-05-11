/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2clase14_grupo2;

import java.awt.FlowLayout;//AWT - 1.0 Applet
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ventana extends JFrame implements ActionListener {

    JTextField text;
    JTextArea area;
    JButton boton, boton2;
    JLabel label;
    JCheckBox check;
    JRadioButton radio1, radio2;
    ButtonGroup gruporadio;

    Ventana() {
        this.setTitle("Mi primera ventana");
        this.setLayout(new FlowLayout());
        this.setSize(500, 300);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton = new JButton("Guardar");
        boton2 = new JButton("Borrar");

        label = new JLabel("Dato:", JLabel.CENTER);
        text = new JTextField(5);
        text.setBounds(0, 0, 100, 100);
        area = new JTextArea("Texto de ejemplo del textarea", 7, 20);
        check = new JCheckBox("Activado");
        radio1 = new JRadioButton("Si");
        radio2 = new JRadioButton("No");

        this.add(label);
        this.add(text);
        this.add(area);
        this.add(boton);
        this.add(boton2);
        this.add(check);
        this.add(radio1);
        this.add(radio2);
        gruporadio = new ButtonGroup();
        gruporadio.add(radio1);
        gruporadio.add(radio2);

        check.addActionListener(this);
        boton.addActionListener(this);
        boton2.addActionListener(this);
        area.setEditable(false);

        this.setVisible(true);
        text.setText("Por otra vaina");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*String todotxt;
        todotxt = this.text.getText() + "\n" + this.area.getText();
        System.out.println(todotxt);*/

        if (e.getSource() == boton) {
            String temporal = this.text.getText();
            this.area.append(temporal);
            this.boton.setLabel("Append");
            System.out.println(check.isSelected());
        } else if (e.getSource() == boton2) {
            this.area.setText("");
        } else if (e.getSource() == check) {
            this.area.setEditable(check.isSelected());
            //this.text.setVisible(check.isSelected());
        }
        //System.out.println(text.isEditable());
        //System.out.println(area.isEditable());

    }

}
