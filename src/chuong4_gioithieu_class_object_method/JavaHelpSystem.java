/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4_gioithieu_class_object_method;

import java.io.IOException;

/**
 *
 * @author hai
 */
public class JavaHelpSystem {
    public static void main(String[] args) throws IOException {
        Help help = new Help();
        char choice , ignore;
        for(;;){
            do{
                help.showMenu();
                choice = (char)System.in.read();
                do{
                    ignore = (char)System.in.read();
                }while(ignore != '\n');
              
            }while(!help.isValid(choice));
            
             if(choice=='q') break;
             
             help.helpon(choice);
        }
       
    }
}
