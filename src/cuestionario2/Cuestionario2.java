/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuestionario2;

 


import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Cuestionario2 {

    public static JButton[] allBtn= new JButton[2];
    public static JTextField[] jtf=new JTextField[2];
    public static  int ale;
    //static String res;
    static String res[]={"HIDROGENO","1989","MARCONI","EDISON","1945","ANDROMEDA"};
    public static void main(String[] args) {
         interfaz2 nf= new  interfaz2();
        nf.setVisible(true);
        
        allBtn[0]= nf.jButton1;
        allBtn[1]= nf.jButton2;
        
        jtf[0]=nf.jTextField1;
        jtf[1]=nf.jTextField2;
        
           }
    
    public static void BtnRm(String val){
        
        Random rn=new Random();
        
        
        if(val.equals("Inicio")){
            allBtn[1].setBackground(Color.white);
            jtf[1].setBackground(Color.white);
            jtf[1].setText("");
            ale= rn.nextInt(0,6);
         
        
        
        switch (ale) {
            case 0:{jtf[0].setText("¿Cual es al elemento mas abundante del universo?");
                }
                break;
            case 1:{jtf[0].setText("¿En que año cayó el muro de Berlin?");
                }
                break;
            case 2:{jtf[0].setText("¿Quien inventó la radio?");
                }
                break;
            case 3:{jtf[0].setText("¿Quien creo la bombilla?");
                }
                break;
            case 4:{jtf[0].setText("¿En que año terminó la segunda guerra mundial?");
                }
                break;
            case 5:{jtf[0].setText("¿Nombre de la galaxia vecina a la via lactea?");
                }
                break;
            default:
                throw new AssertionError();
        }
        } 
        else if(val.equals(res[ale])){jtf[0].setText("¡¡¡Correcto!!!");
            allBtn[1].setBackground(Color.green);
            jtf[1].setBackground(Color.green);}
        
        else if(!val.equals(res[ale])){jtf[0].setText("Lo siento, la respuesta es: "+res[ale]);
            allBtn[1].setBackground(Color.red);
            jtf[1].setBackground(Color.red);}
    }  
    }
    

