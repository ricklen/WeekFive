package labFiles;

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
        
    public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
    	Map<V, Set<K>> inverse = new HashMap<V, Set<K>>();
    	
    	ArrayList<V> list = new ArrayList<V>(map.values());
    	Set<K> set = new HashSet<K>(map.keySet());
    	
    	for (V v : list) {
    		inverse.put(v, set.
    		
    		
    	}
    	
    	
    	
        // TODO: implement, see exercise P-5.3
        return null;
	}
	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
        // TODO: implement, see exercise P-5.3
        return null;
	}
	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
        // TODO: implement, see exercise P-5.4
        return false;
	}
	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
        // TODO: implement, see exercise P-5.5
        return null;
	}
}
