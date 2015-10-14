package javaapplication1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Histogram <T>{

    private final Map<T,Integer> map = new HashMap<>();

    public Integer get(Object key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    public Integer increment(T key){
        if(map.containsKey(key)){
            map.put(key,map.get(key)+1);
        }else{
            map.put(key,1);
        }
        return map.put(key, map.containsKey(key) ?  map.get (key) +1  : 1);
    }


}