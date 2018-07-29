/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author ivan_grinenko
 */
public class SuperShow {
    
    public String str = "SuperStr";
    
    public void show(){
        System.out.println("SuperShow:" + str);
    }
    
    public static void showStatic(){
        System.out.println("SuperShowStatic Called");
    }
    
}
