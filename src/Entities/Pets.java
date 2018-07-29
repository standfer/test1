/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

/**
 *
 * @author ivan_grinenko
 */
public class Pets {
    
    public Pets(){
        
    }
    
    public static List<Pet> arrayList(){
        List<Pet> pets = new LinkedList<>();
        pets.add(new Pet(1, "Rat"));
        pets.add(new Pet(2, "Manx"));
        pets.add(new Pet(3, "Cymric"));
        pets.add(new Pet(4, "Mutt"));
        pets.add(new Pet(5, "Pug"));
        pets.add(new Pet(6, "Cymric"));
        pets.add(new Pet(7, "Pug"));
        return pets;
    }
    
    public static void display(ListIterator<Pet> listIterator){
        while(listIterator.hasPrevious()){
            Pet p = listIterator.previous();
            System.out.print(p.getId() + "_" + p.getName() + " ");
        }
    }
}
