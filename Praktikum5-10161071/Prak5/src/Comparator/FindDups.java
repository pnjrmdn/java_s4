package Comparator;

import java.util.*; 
 public class FindDups {     
     public static void main(String[] args) {         
         SortedSet<String> s = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER); 
         Collections.addAll(s, args);
         for (String a : args)
             s.add(a);
         System.out.println(s.size() + " distinct words: " + s);
    }
}
