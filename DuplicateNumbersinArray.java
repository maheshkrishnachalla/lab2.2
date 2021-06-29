package in.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateNumbersinArray {
	
static int[] array = {1,5,2,7,3,2,3,6,1,5,1,1,7,33,22,6,6,34,7,9,8,6,9};
	
public static void duplicatesinArray(int[] n) {
	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	for(int i=0;i<n.length;i++) {
		if(hashMap.containsKey(n[i])) {
			hashMap.put(n[i], hashMap.get(n[i])+1);
		}
		else {
			hashMap.put(n[i], 1);
		}
	}
	
	for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	}
	
}
	public static void main(String[] args) {
		duplicatesinArray(array);
	}

}
