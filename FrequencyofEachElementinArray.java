package in.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyofEachElementinArray {

	static int[] array = {1,5,2,7,3,2,3,6,1,5,1,1,7,33,22,6,6,34,7,9,8,6,9};
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++) {
			if(hashMap.containsKey(array[i])){
				hashMap.put(array[i], hashMap.get(array[i])+1);
			}
			else {
				hashMap.put(array[i], 1);
			}
		}
		System.out.println(" Number   |   Frequency");
		System.out.println("========================= ");
		for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+ "      :       "+ entry.getValue());
		}
	}
}
