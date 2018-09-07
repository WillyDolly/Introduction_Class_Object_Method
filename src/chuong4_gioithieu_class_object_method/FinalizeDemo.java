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
public class FinalizeDemo {
    int x;
    FinalizeDemo(int i){
        x = i;
    }
    
    protected void finalize(){
        System.out.println("x: "+x);
    }
    
     void generator(int k){
        FinalizeDemo o = new FinalizeDemo(k);
    }
}
