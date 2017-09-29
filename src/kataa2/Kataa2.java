package kataa2;

import java.util.*;

public class Kataa2{
    public static void main(String[] args) {
        int [] data = {1,1,1,0,1,2,1,0,3};
        Map<Integer, Integer> myMap = new HashMap<>();
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key) + " veces");
        }
    }  
}