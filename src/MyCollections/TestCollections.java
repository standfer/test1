/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCollections;

import Entities.Hamster;
import Entities.Person;
import Entities.Pet;
import Entities.Pets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 *
 * @author ivan_grinenko
 */
public class TestCollections {
    
    public TestCollections(){
        
    }
    
    public void adding(){
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        //collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11,12);
        
        List<Integer> list =  Arrays.asList(16,17,18,19,20);
        list.add(20);
        //list.set(0, 99);
        //list.add(21);
        
        System.out.println(list);
    }
    
    
    public static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        
        return collection;
    }
    
    public static Map fill(Map<String,String> map){
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        
        return map;
    }
    
    public static void printing(){
        System.out.println("ArrayList: "+ fill(new ArrayList<String>()));
        System.out.println("LinkedList: "+ fill(new LinkedList<String>()));
        
        System.out.println("HashSet: "+ fill(new HashSet<String>()));
        System.out.println("LinkedHashSet: "+ fill(new LinkedHashSet<String>()));
        System.out.println("TreeSet: "+ fill(new TreeSet<String>()));
        
        System.out.println("PriorityQueue: "+ fill(new PriorityQueue<String>()));
        
        System.out.println("HashMap: "+ fill(new HashMap<String, String>()));
        System.out.println("LinkedHashMap: "+ fill(new LinkedHashMap<String, String>()));
        System.out.println("TreeMap: "+ fill(new TreeMap<String, String>()));
    }
    
    public static void printList(){
        LinkedList<Pet> pets = (LinkedList) Pets.arrayList();
        Hamster h = new Hamster(23, "Hamster");
        pets.offer(h);
        
        System.out.println(pets);
        System.out.println("peek:" + pets.peek() + " | " + pets);
        System.out.println("poll:" + pets.poll() + " | " + pets);
        System.out.println("pop:" + pets.pop() + " | " + pets);
        
        
        System.out.println(pets);
        
        /*Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "+");
        }*/
        //Pets.display(pets.listIterator(pets.size()));
        
        System.out.println();

    }
    public static void printSet(){
        Random rand = new Random(47);
        Set<Integer> intSet = new HashSet<>();
        for(int i = 0; i<10000; i++){
            intSet.add(rand.nextInt(30));
        }
        
        System.out.println(intSet);
    }
    
    public static void mapTest(){
        /*Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i = 0; i<10000; i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }*/
        
        /*Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Dog", new Pet(1, "Dog Barsik"));
        petMap.put("My Cat", new Pet(2, "Cat Rex"));
               
        System.out.println(petMap);
        System.out.println(petMap.containsKey("My fish"));
        System.out.println(petMap.get("My Dog"));*/
        
        Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
        petPeople.put(new Person(1, "Ivan"), Arrays.asList(new Pet(1, "Barsik"), new Pet(2, "Baks")));
        petPeople.put(new Person(2, "Elena"), Arrays.asList(new Hamster(1, "Хомяк"), new Pet(2, "Tuzik")));
        
        System.out.println(petPeople);
        
        System.out.print("People: "+ petPeople.keySet());
        System.out.print("Pets: "+ petPeople.values());
        System.out.println();
        
        for(Person person : petPeople.keySet()){
            System.out.print(person + " has ");
            for(Pet pet : petPeople.get(person)){
                System.out.print(pet + " ");
            }
        }
        System.out.println();
        
        for(List<? extends Pet> petList : petPeople.values()){
            System.out.println(petList);
        }
        
    }
    
    public static void QueueTest(){
        Queue<Character> qc = new LinkedList<>();
        for(Character c : "Brontosaurus".toCharArray()){
            qc.add(c);
            System.out.print(qc);
        }
        System.out.println(qc);
        printQ(qc);
        
    }
    
    public static void QueuePriority(){
        PriorityQueue<Integer> priorityQueue;
        List<Integer> ints = Arrays.asList(25,22, 20, 18, 14, 9, 3,
                1, 1, 2, 3, 9, 14, 18, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        
        printQ(priorityQueue);
        System.out.println(priorityQueue);
    }
    
    private static void printQ(Queue queue){
        while(queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
