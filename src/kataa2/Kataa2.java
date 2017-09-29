package kataa2;

import java.util.*;

public class Kataa2 {
    public static void main(String[] args) { 
        String [] data = {"uno", "uno", "dos", "tres", "tres"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (String key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key) + " veces");
        }
    }
}