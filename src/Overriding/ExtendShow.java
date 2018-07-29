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
public class ExtendShow extends SuperShow {
    public String str = "ExtendStr";
    
    @Override
    public void show(){
        System.out.println("ExtendShow:" + str);
    }
    
    public static void showStatic(){
        System.out.println("ExtendShowStatic Called");
    }
    
}
