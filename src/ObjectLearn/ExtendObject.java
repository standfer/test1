/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectLearn;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivan_grinenko
 */
public class ExtendObject extends Object implements Cloneable  {
    
    public String name;
    public ExtendObject(){
        
    }
    public ExtendObject(String name){
        super();
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this.name == (String)obj) return true;
        return false;
    }
    
    @Override
    public Object clone(){
        Object result = null;
        try {
            result = super.clone();
        }
        catch(CloneNotSupportedException ex) {}
        return result;
    }
    @Override
    public void finalize(){
        try {
            super.finalize();
            this.name = null;
        } catch (Throwable ex) {
            Logger.getLogger(ExtendObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
