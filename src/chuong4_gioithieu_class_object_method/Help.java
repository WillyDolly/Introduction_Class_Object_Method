/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4_gioithieu_class_object_method;

/**
 *
 * @author hai
 */
public class Help {
    
    public void showMenu(){
         System.out.println("type one number: ");
                System.out.println("1. if ");
                System.out.println("2. switch");
                System.out.println("3. do-while");
                System.out.println("4. while");
                System.out.println("5. for");
    }
    
    public boolean isValid(char ch){
        if(ch<'1' | ch>'5' & ch!='q')
            return false;
        else
            return true;
    }
    
    public void helpon(int what){
         switch(what){
            case '1': System.out.println("if(condition){");
                      System.out.println("code block}");
                      System.out.println("else{"); 
                      System.out.println("code block}"); break;
            case '2': System.out.println("switch(variable){");  
                      System.out.println("case value1 : code; break;");
                      System.out.println("case value1 : code; break;");
                      System.out.println("default : code; break;"); break;
            case '3': System.out.println("do{");
                      System.out.println("code");
                      System.out.println("}while(condition);");break;
            case '4': System.out.println("while(condition){"); 
                      System.out.println("code}");break;
            case '5': System.out.println("for(initialize variable;condition;loop variable){");
                      System.out.println("code};");break;
        }
    }
}

