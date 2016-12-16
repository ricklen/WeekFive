package labFiles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	// TODO: ask these questions
	//@ requires dat er een goede map in gaat?
	//@ ensures \result == true || \result == false;
	//@ ensures duplicate value ==> false; 			???
	//*@pure*/
	// This method puts all values into a set to check for duplicates
    public static <K, V> boolean isOneOnOne(Map<K, V> map) {
        // Waarom moet deze static? ???
    	int length = map.size();
    	Set<V> set = new HashSet<V>(map.values());
    	if (set.size() < length) {
    		return false;
    	} else {
    		return true;
    	}

    }

    public static <K, V> 
           boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
        int counter = 0;
        
//        for (int i = 0; i < range.size(); i++) {
//        	if (!map.containsKey(range[i])) {
//        		
//        	}
//        }
        
        
        
    	for (int i = 0; i < map.size(); i++) {
    		Object x = map.get(i);
    		for(Object c : range){
    			if (x.equals(c)){
    				counter++;
    			}
    			
    		}
    	}
    	if (counter == range.size()){
    		return true;
    	}
    	
    	// kijk naar alle values in de range of er een key bij hoort waarvoor geldt k.get = v
    	
        return false;
    }
    public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
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
