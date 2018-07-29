/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexceptions;
import InterfaceLearn.Games.BoardGame;
import MyCollections.TestCollections;
import MyExceptions.NoSuchAttributeException;
import Overriding.ExtendShow;
import Overriding.SuperShow;
import SuperLearn.*;
import ValueProcessing.Attr;
import ObjectLearn.*;
import InterfaceLearn.*;
import InterfaceLearn.Hiding.*;

/**
 *
 * @author ivan_grinenko
 */
public class TestExceptions {

    /**
     * @param args the command line arguments
     */



    public static void main(String[] args) throws NoSuchAttributeException {
        // TODO code application logic here
        /*System.out.println("hello world");
        SkyBody skyBody1 = new SkyBody(5,100);
        SkyBody skyBody2 = new SkyBody(5, 200);
        System.out.println("Результат сравнения: " + skyBody1.compareTo(skyBody2));
        Comparable body = new SkyBody(12,35);
        System.out.println(((SkyBody)body).increment());*/
        
        /*Verbose human = new Human();
        human.setVerbosity(Human.TERSE);
        System.out.println(human.getVerbosity());
        
        X x = new RealizationX();
        RealizationY y = new RealizationY();
        
        //System.out.println("X.VAL="+X.VAL + ";Y.VAL=" + Y.VAL + ";Y.SUM=" + Y.SUM);
        //System.out.println("realizY.VAL="+y.VAL+",((Y)realizY).VAL="+((Y)y).VAL+",((X)y).VAL="+((X)y).VAL);
        
        System.out.println(D.VAL);*/
        
        //sorting
        /*int[] mas = {5,2,7,3,8};
		int temp = 0;
		
		for(int i=mas.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(mas[j]>mas[j+1]){
					temp = mas[j+1];
					mas[j+1] = mas[j];
					mas[j] = temp;					
				}
			}
		}
	for(int i=0; i<mas.length; i++)
            System.out.println(mas[i]);*/

        /*TestCollections testCollections = new TestCollections();
        testCollections.QueuePriority();*/

        BoardGame boardGame = new BoardGame(11);
        //test git1
    }
    
    public static void replaceValue (String name, Object newValue) throws NoSuchAttributeException{
        Attr attr = Attr.find(name);
        if(attr==null) throw new NoSuchAttributeException(name);
        attr.setValue(newValue);
    }
    
}
