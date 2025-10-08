import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

public class Ventana extends JFrame {
    JButton botonclear,boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,botonsuma,botonresta,botonmulti,botondivi,botonenter;
    int  num1final, num2final ;
    double resultado;
    boolean suma=false,resta=false,multi=false,divi=false, cambionum=false, solounaoperacion=false;
    String num1="",num2="";

    JTextField pantalla;
    Calculosuma controlador;
    
    public Ventana() {
        setTitle("Calculadora");
        setSize(800, 600);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,4,5,5));

         pantalla= new JTextField();
        pantalla.setEditable(false);

        

       
        

        botonenter = new JButton(" = ");
        botonenter.setBackground(Color.gray);
        botonenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               num2final=Integer.parseInt(num2);

               if (suma==true) {
                    Calculosuma controlador = new Calculosuma(num1final,num2final);
                    resultado=controlador.obtenerSuma();
               }
               if (resta==true) {
                    Calculoresta controlador = new Calculoresta(num1final,num2final);
                    resultado=controlador.obtenerResta();
               }
               if (multi==true) {
                    Calculomulti controlador = new Calculomulti(num1final,num2final);
                    resultado=controlador.obtenerMulti();
               }
               if (divi==true) {
                    if (num2final==0) {
                        String mensaje = "Error, no se puede dividir entre 0";
                        JOptionPane.showMessageDialog(null, mensaje);  
                    }
                    else{
                        Calculodivi controlador = new Calculodivi(num1final,num2final);
                        resultado=controlador.obtenerDivi();
                    }
               }
               pantalla.setText("");
               pantalla.setText(pantalla.getText() +  resultado);
            }
        });
        botonclear= new JButton("clear");
        botonclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                pantalla.setText("");
                solounaoperacion=cambionum=suma=resta=multi=divi=false;
                num1=num2="";
                num1final=num2final=0;
            }
        });
        boton1 = new JButton(" 1 ");
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numtemp="1";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton0 = new JButton(" 0 ");
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="0";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton2 = new JButton(" 2 ");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="2";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton3 = new JButton(" 3 ");
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="3";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton4 = new JButton(" 4 ");
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numtemp="4";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton5 = new JButton(" 5 ");
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="5";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton6 = new JButton(" 6 ");
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="6";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton7 = new JButton(" 7 ");
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="7";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton8 = new JButton(" 8 ");
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="8";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        boton9= new JButton(" 9 ");
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String numtemp="9";
                if (cambionum==false) {   
                    num1=num1+numtemp;
                    System.out.println(num1);
                }
                else if (cambionum==true){
                    num2=num2+numtemp;
                    System.out.println("num2"+ num2);
                }
                pantalla.setText(pantalla.getText() + numtemp);
            }
        });
        botonsuma = new JButton(" + ");
        botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solounaoperacion==false) {
                    num1final=Integer.parseInt(num1);
                    cambionum=true;
                    suma=true;
                    solounaoperacion=true;
                    pantalla.setText(pantalla.getText() + "+");
                }
                else{
                    String mensaje = "Error, solo se permite una operación";
                    JOptionPane.showMessageDialog(null, mensaje);                
                }
            }
        });
        botonresta = new JButton(" - ");
        botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (solounaoperacion==false) {
                    num1final=Integer.parseInt(num1);
                    cambionum=true;
                    resta=true;
                    solounaoperacion=true;
                    pantalla.setText(pantalla.getText() + "-");
                }
                else{
                    String mensaje = "Error, solo se permite una operación";
                    JOptionPane.showMessageDialog(null, mensaje);                
                }
            }
        });
        botonmulti = new JButton(" x ");
        botonmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (solounaoperacion==false) {
                    num1final=Integer.parseInt(num1);
                    cambionum=true;
                    multi=true;
                    solounaoperacion=true;
                    pantalla.setText(pantalla.getText() + "x");
                }
                else{
                    String mensaje = "Error, solo se permite una operación";
                    JOptionPane.showMessageDialog(null, mensaje);                
                }
            }
        });
        botondivi = new JButton(" / ");
        botondivi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solounaoperacion==false) {
                    num1final=Integer.parseInt(num1);
                    cambionum=true;
                    divi=true;
                    solounaoperacion=true;
                    pantalla.setText(pantalla.getText() + "/");
                }
                else{
                    String mensaje = "Error, solo se permite una operación";
                    JOptionPane.showMessageDialog(null, mensaje);                
                }
            }
        });

        pantalla.setFont(new Font("Arial", Font.BOLD, 20));
        boton1.setFont(new Font("Arial", Font.BOLD, 20));
        boton2.setFont(new Font("Arial", Font.BOLD, 20));
        boton3.setFont(new Font("Arial", Font.BOLD, 20));
        boton4.setFont(new Font("Arial", Font.BOLD, 20));
        boton5.setFont(new Font("Arial", Font.BOLD, 20));
        boton6.setFont(new Font("Arial", Font.BOLD, 20));
        boton7.setFont(new Font("Arial", Font.BOLD, 20));
        boton8.setFont(new Font("Arial", Font.BOLD, 20));
        boton9.setFont(new Font("Arial", Font.BOLD, 20));
        boton0.setFont(new Font("Arial", Font.BOLD, 20));
        botonsuma.setFont(new Font("Arial", Font.BOLD, 20));
        botonresta.setFont(new Font("Arial", Font.BOLD, 20));
        botonmulti.setFont(new Font("Arial", Font.BOLD, 20));
        botondivi.setFont(new Font("Arial", Font.BOLD, 20));
        botonenter.setFont(new Font("Arial", Font.BOLD, 20));
        botonclear.setFont(new Font("Arial", Font.BOLD, 20));

        add(pantalla);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(boton0);
        add(botonsuma);
        add(botonresta);
        add(botonmulti);
        add(botondivi);
        add(botonenter);
        add(botonclear);
    }
}