/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyExceptions;

/**
 *
 * @author ivan_grinenko
 */
public class NoSuchAttributeException extends Exception {
    
    public String attrName;
    
    public NoSuchAttributeException(String name){
        super("Атрибут с именем \""+name + "\" не найден");
        attrName=name;
    }
    
}
