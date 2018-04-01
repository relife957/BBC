package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
	public static void recover(String[] words , Map<String,Integer> map) {
		for(String word :words) {
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}else {
				map.put(word, map.get(word)+1);
			}
		}
	}
	public static List<Integer> findSubstring(String s, String[] words) {
        int slen = s.length() ;
        int wordslen = words.length ;
        int singlewordlen = words[0].length() ;
        int i , j , count ;
        Map<String, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
		if(slen == 0 || wordslen == 0) {
			return result ;
		}
		boolean flag = false ;
		count = wordslen ;
		recover(words, map);
		for(i = 0 ; i < slen - wordslen*singlewordlen ;i++) {
			//System.out.println(i);
			String substr = s.substring(i, i+singlewordlen);
			j = i ;
			while(map.containsKey(substr) && map.get(substr)!=0 && j+singlewordlen <= slen) {
				map.put(substr, map.get(substr)-1);
				flag = true ;
				count-- ;
				
				j = j + singlewordlen ;
				if(j+singlewordlen<=slen) {
					substr = s.substring(j,j+singlewordlen);
				}
				//System.out.println(substr);
				if(!map.containsKey(substr) || map.get(substr)!=0) {
					//System.out.println(i);
					break ;
				}
			}
			if(count == 0) {
				result.add(i);
			}
			if(flag) {
				map.clear();
				recover(words, map);
				count = wordslen ;
				flag = false ;
			}
		}
		return result ;
    }
	public static void main(String[] args) {
		String[] words= {"word","good","best","good"} ;
		String string = "wordgoodgoodgoodbestword" ;
		findSubstring(string, words) ;
	}
}
