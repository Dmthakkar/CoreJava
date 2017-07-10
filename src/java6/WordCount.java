package java6;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount{
	public static void main(String[] args){
		WordCount wordCount = new WordCount();
		Map<String, Integer> phrase = wordCount.countJava8("one fish two fish red fish blue fish");
		Map<String, Integer> count = wordCount.count("one Fish two fish red fish blue fish");

		System.out.println(phrase);
		System.out.println();
		System.out.println(count);
	}
	public Map<String, Integer> count(String input){
		Map<String, Integer> wordcount = new HashMap();
		Pattern compile = Pattern.compile("(\\w+)");
		Matcher matcher = compile.matcher(input);

		while(matcher.find()){
			String word = matcher.group().toLowerCase();
			if(wordcount.containsKey(word)){
				Integer count = wordcount.get(word);
				wordcount.put(word, ++count);
			} else {
				wordcount.put(word.toLowerCase(), 1);
			}
		}
		return wordcount;
	}
	public Map<String, Integer> countJava8(String input){
		 return Pattern.compile("\\W+")
                 .splitAsStream(input)
                 .collect(Collectors.groupingBy(String::toLowerCase,
                                                Collectors.summingInt(s -> 1)));
	}
	
	public static Map<String, Integer> countOldschool(String input) {
	    Map<String, Integer> wordcount = new HashMap<>();
	    Matcher matcher = Pattern.compile("\\w+").matcher(input);
	    while (matcher.find()) {
	        String word = matcher.group().toLowerCase();
	        wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
	    }
	    return wordcount;
	}
}