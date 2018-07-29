/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectLearn;

/**
 *
 * @author ivan_grinenko
 */
public class ClassToClone implements Cloneable {
    
    public int number;
    public String name;
    public ExtendObject extendObject;
    
    public ClassToClone(int number, String name){
        this.number = number;
        this.name = name;
        extendObject = new ExtendObject();
    }
    
    @Override
    public Object clone(){
        ClassToClone result = null;
        try{
            result = (ClassToClone) super.clone();
            result.extendObject = (ExtendObject) extendObject.clone();
        }
        catch(CloneNotSupportedException ex){}
        return result;
    }
    
}
