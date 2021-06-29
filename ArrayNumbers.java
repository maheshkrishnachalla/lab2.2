package in.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.standard.Finishings;

public class ArrayNumbers {

	public static Set<Integer> oddNumberinArray(int[] array) {
		Set<Integer> odd = new TreeSet<Integer>();
		for(int i=0;i<array.length;i++) {
			if((array[i]&1)!=0) {
				odd.add(array[i]);
			}
		}
		return odd;
	}
	
	public static Set<Integer> evenNumberinArray(int[] array) {
		Set<Integer> even = new TreeSet<Integer>();
		for(int i=0;i<array.length;i++) {
			if((array[i]&1)==0) {
				even.add(array[i]);
			}
		}
		return even;
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
               ls.add(index+1); 
            }
                nums[index] = -nums[index];
            }
        return ls;
    }
	
	
	public static void main(String[] args) {
		int[] array = {2,4,2,6,3,6,8,15,18,44,55,21,74,66,45,22,76};
		int[] array2 = {4,3,2,7,8,2,3,1};
		Set<Integer> set = new TreeSet<Integer>();
		set = oddNumberinArray(array);
		System.out.println("odd in Array :"+set);
		set = evenNumberinArray(array);
		System.out.println("even in Array :"+set);
		System.out.println(2^3^2^5^5^7^6^3);
		System.out.println(findDuplicates(array2));
		
	}
}
