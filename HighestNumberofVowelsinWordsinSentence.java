package in.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HighestNumberofVowelsinWordsinSentence {
	
	public static Set<String> getWordsFromSentence(String sentence) {
		String[] strArray = sentence.split(" ");
		System.out.println(sentence);
		
		Set<String> set = new TreeSet<String>(); 
		
		for(int i =0 ; i<strArray.length;i++) {
			set.add(strArray[i].toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
		}
		return set;
		
	}
	
	public static Map<String,Integer> getWordsHavingMoreVowels(Set<String> words) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String i:words) {
			int c=0;
			char[] ch = i.toCharArray();
			for(char j:ch) {
			if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u') {
			c= c+1;
			}
			map.put(i,c);
		}
		}
		
		return map;
		
		
	}
		
	
public static Map<String,Integer> getSortedWords(Map<String,Integer> words) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		List<Map.Entry<String, Integer>> list= new LinkedList<Map.Entry<String,Integer>>(words.entrySet());
		
		Collections.sort(list, (i1,i2)-> i2.getValue().compareTo(i1.getValue()));
		
		HashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> kv : list) {
			hashMap.put(kv.getKey(), kv.getValue());
		}
	
		
		
		return hashMap;
		
		
	}
	
	
public static Set<String> getWordsHavingVowels(Set<String> words) {
		
		Set<String> vowelWords = new TreeSet<String>(); 
		for(String i:words){
			if(i.contains("a")||i.contains("e")||i.contains("i")||
					i.contains("o")||i.contains("u")) {
				vowelWords.add(i);
				
			}
			
		}
		
		return vowelWords;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Sentence : ");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		Set<String> words = getWordsFromSentence(sentence);
		Set<String> vowelWords = getWordsHavingVowels(words);
		
		/*for(String s:vowelWords) {
			System.out.println(s);
		}*/
		
		Map<String, Integer> morevowelsWords= getWordsHavingMoreVowels(vowelWords);
		
		Map<String, Integer> sortedMap = getSortedWords(morevowelsWords);
		
		sortedMap.forEach((key, value) -> System.out.println(key));

		
		
	}

}
