/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLearn;

/**
 *
 * @author ivan_grinenko
 */
public class SkyBody implements Comparable {
    public int item;
    
    public int distanceToCount;
    
    public SkyBody(){}
    public SkyBody(int item, int distanceToCount){
        this.item = item;
        this.distanceToCount = distanceToCount;
    }
    
    public int increment(){
        return ++this.item;
    }
    @Override
    public int compareTo(Object o){
        SkyBody other = (SkyBody)o;
        if(other.item == this.item){
            return Math.abs(this.distanceToCount - other.distanceToCount);
        }
        else throw new IllegalArgumentException();
    }
    
}
