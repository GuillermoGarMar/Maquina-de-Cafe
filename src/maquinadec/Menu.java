/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadec;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Menu {
    public void añAzucar(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       boolean ex = true;
       String sele="";
        while(ex==false){
        System.out.println("Que bebida quiere tomar?");
        System.out.println("a.-Cafe");
        System.out.println("b.-Chocolate");
        System.out.println("c.-Te");
        System.out.println("d.-Salir");
        
        sele=JOptionPane.showInputDialog(null,"Que tomará?");
        
        switch(sele){
            case "a":
                
                    
           
        }
      }
    }
    
}
