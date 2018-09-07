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
public class GarbageCollection_Finalize {
    public static void main(String[] args) {
        int count = 0;
        FinalizeDemo ob = new FinalizeDemo(count);
        
        for(count=1;count<100000;count++){
            ob.generator(count);
        }
    }
}
