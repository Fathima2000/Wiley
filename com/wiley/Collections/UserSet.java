package com.wiley.Collections;

import java.time.Instant;
import java.util.*;
import java.util.stream.Stream;

public class UserSet {

    public void main(){
//*******************************************************************************************
        // set doesnt allow duplication
        // doesnt allow null values
//        Set set = new HashSet(); // uses hashmap to store the values
//        set.add(11);
//        // set.put(1,obj);
//        // set.put(2,obj);
//        set.add(2);
//        set.add("Hello");
//        //set.add(null);
//        set.add(null);
//        set.add("");
//        set.forEach(System.out::println);


//*******************************************************************************************
//        for (int i = 0; i < 5000; i++) {
//            set.add(i);
//        }

        //System.out.println(Instant.now());
        // stream performs sequential execution
        //set.stream().forEach(System.out::println);
       // System.out.println(Instant.now());

       // System.out.println(Instant.now());
        // parallel stream performs concurrent execution i.e. it will perform random processing
        // no order shall be maintained
        //set.parallelStream().forEachOrdered(e1->System.out.println("Parallel Ordered "+e1));
//        set.parallelStream().forEach(ee-> System.out.println("Parallel "+ee));
        //System.out.println(Instant.now());
    	
    	
//*******************************************************************************************
        //Set set1 = new TreeSet(); // inherits from sorted set

//        Iterator itr = set.iterator();
//        System.out.println(Instant.now());
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(Instant.now());

        // uses tree map to store values
//        System.out.println("TREE SET.... ");
        // treemap doesnt allow null values
//        Set<String> set1 = new TreeSet<>(Comparator.reverseOrder()); // inherits from sorted set
//        set1.add("Hi");
//        set1.add("Hello");
//        set1.add("Hola!");
//        set1.add(new String("HI"));
//        set1.add(new String("HI"));

        // duplicate value  not allowed
//        set1.add("Hi");
        // null values arent permitted
        //set1.add(null);

//        Integer intt = new Integer(12);
//        set1.add(intt);
//        set1.forEach(System.out::println);

//*******************************************************************************************
        // custom objects stored in set
//        Set<User> userSet = new TreeSet(Comparator.comparing(User::getId));
//        //Set<User> userSet = new TreeSet<>((u1,u2)->u2.getName().compareTo(u1.getName()));
//        //Set<User> userSet = new TreeSet();
//
//        userSet.add(new User(1,"User"));
//        userSet.add(new User(3,"User3"));
//        userSet.add(new User(5,"User5"));
//        userSet.add(new User(2,"User2"));
//        userSet.add(new User(4,"User4"));
//        userSet.add(new User(5,"User6"));
//        //userSet.add(new User(6,"User6"));
//
//        userSet.stream().forEach(u-> System.out.println("User "+"ID: "+u.getId()+"::"+u.getName()));
        
//*******************************************************************************************

        Set<Type> customSet = new TreeSet<>();

        customSet.add(new Type(new Integer(10)));
        customSet.add(new Type("Elephant"));
        customSet.add(new Type(new Integer(4)));
        customSet.add(new Type(new Integer(6)));
        customSet.add(new Type(new Integer(5)));
        customSet.add(new Type("Atimal"));
        customSet.add(new Type("Animal"));
        customSet.add(new Type("Horse"));
        customSet.add(new Type(new Integer(2)));
        
        customSet.forEach(System.out::println);
    }
}

class Type implements Comparable<Type>{
    private Object object; // int // string // user -- expected sort : 1,2,Hello,Hi, User{1,"User1"}, User{2,"User2"}

    public Type(){

    }
    public Type(Object object){
        this.object = object;
    }
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "--"+ object +"";
    }

    @Override
    public int hashCode() {
        return object.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Type next) {
        // handle null values at the beginning
        if(this.object == null || next.object == null){
            return -1;
        }
        if(this.object instanceof Integer){
            if(next.object instanceof Integer){
                int i = (int)next.object;
                int j = (int)this.object;
                return j - i;
            }else if(next.object instanceof String){
                return -1;
            }
            return 0;
        }else if(this.object instanceof String){
            if(next.object instanceof String){
                String str1 = (String)this.object;
                String str2 = (String)next.object;
                return str1.compareTo(str2);
            }else if(next.object instanceof Integer){
                return 1;
            }
            return 0;
        }
        return 0;
    }
}

//*******************************************************************************************


class User {
    private int id;
    private String name;

    public User(){

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.getId();
    }
}



// Exception in thread "main" java.lang.ClassCastException:
//                  java.lang.Integer cannot be cast to java.lang.String
//	at java.lang.String.compareTo(String.java:111)

// Exception in thread "main" java.lang.ClassCastException:
//                  java.lang.String cannot be cast to java.lang.Integer
//	at java.lang.Integer.compareTo(Integer.java:52)


// set = 4, 10, "Elephant","Atimal", "Animal", 2
// option 1 : use comparable
// use compareTo()
//