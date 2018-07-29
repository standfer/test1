/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperLearn;

/**
 *
 * @author ivan_grinenko
 */
public class More extends That {
    
    @Override
    public String nm(){
        return "More";
    }
    
    public void printNM(){
        That sref = (That)this;
        That sref2 = new That();
        System.out.println("this.nm():" + this.nm());
        System.out.println("sref.nm():" + sref.nm());
        System.out.println("super.nm():" + super.nm());
        System.out.println("sref2.nm():" + sref2.nm());
    }
    
}
