/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ivan_grinenko
 */
public class Pet implements Comparable<Pet>{
    
    private int id;
    private String name;
    
    public Pet(){
        
    }
    
    public Pet(int id, String name){
        this.id = id; this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet pet) {
        return this.name.compareTo(pet.name) ;
    }

    
    
    
}
