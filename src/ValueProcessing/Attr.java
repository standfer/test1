/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueProcessing;

/**
 *
 * @author ivan_grinenko
 */
public class Attr {
    
    private Object oldValue;
    private String numberAttr;
       
    public Attr(){}
    public Attr(String numberAttr){
        this.numberAttr = numberAttr;
    }
    
    public static Attr find(String name){
       if("null".equals(name)) return null;
       return new Attr(name);
    }
    public Object getValue(){
        return oldValue;
    }
    public void setValue(Object newValue){
        this.oldValue = newValue;
    }

    
     
    
}
