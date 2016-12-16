package labFiles;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	
	//@ ensures (\forall k1,k2; k1 != k2; get(k1) != get(k2));
	//@pure
	// This method puts all values into a set to check for duplicates
    public static <K, V> boolean isOneOnOne(Map<K, V> map) {
    	int length = map.size();
    	Set<V> set = new HashSet<V>(map.values());
    	if (set.size() < length) {
    		return false;
    	} else {
    		return true;
    	}

    } 

    //@ ensures (\forall v; range.contains(v); map.containsValue(v)); 
    public static <K, V> boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
        for (V i : range) {
        	if (!map.containsValue(i)) {
        		return false;
        	}
        }
        return true;
    }
        
    
    //@ ensures (\forall k; inverse(inverse) = k)
    public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
    	Map<V, Set<K>> newMap = new HashMap<V, Set<K>>();
    	for (Map.Entry<K, V> entry : map.entrySet()	) {
    		HashSet<K> set = new HashSet<K>();
    		
    		if (!newMap.containsKey(entry.getValue())) {
    			set.add(entry.getKey());
    			newMap.put(entry.getValue(), set);
    		} else {
    			newMap.get(entry.getValue()).add(entry.getKey());
    		}
    	}
    	return newMap;
    }
    		


	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
        if (isOneOnOne(map)) {
        	Map<V, K> newMap = new HashMap<V, K>();
        	for (Map.Entry<K, V> entry : map.entrySet()) {
        		newMap.put(entry.getValue(), entry.getKey());
        	}
        	return newMap;
        } else {
        	return null;
        }
	}

        
	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
		for (Map.Entry<K, V> entry : f.entrySet()) {
			if (!g.containsKey(entry.getValue())) {
				return false;
			}
		}
        return true;
	}
	
	//@ ensures (!compatible(f,g) ==> \result == null);
	//@ ensures (compatible(f,g)  ==> (\forall k; compose(k.getValue ???
	// TODO: WTF?
	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
		if (compatible(f, g)) {
			Map<K, W> newMap = new HashMap<K, W>();
			for (Map.Entry<K, V> entry : f.entrySet()) {
				newMap.put(entry.getKey(), g.get(entry.getValue()));
			}
		return newMap;
		}
        return null;
	}
}















