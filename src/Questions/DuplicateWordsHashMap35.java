package Questions;

/*
Hey java is java best language is java
java = 3 times
is = 2 times
we have to find duplicate words. words coming more than one time. We will use hashmap

(String inputString) = says give me the string and i will find it for you.
split(" ") = split on the basis of one space. after each word there is space.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsHashMap35 {

    public static void main(String[] args) {

        findDuplicateWords("Hey java is java best language is java");
        findDuplicateWords("Hey python is not java but best language is python not java");
        findDuplicateWords("hi hi hi hi hi");
        findDuplicateWords("hello");
        findDuplicateWords("100 100 200 100 200");

    }


    public static void findDuplicateWords(String inputString){

        //1. we will split this string
        String words[] =inputString.split(" "); //after each word there is space so splitting on the basis of one space. the split is stored in string array.

        //create one hashmap: creating hashmap with the help of map interface.
        Map<String, Integer> wordCount = new HashMap<String, Integer>(); //String= key=eg java; integer=value=word count

        //to check each word in given array:
        for(String word: words ){

            //actual logic: if word is present in array
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
            }
            else{
                wordCount.put(word, 1);
            }
        }

        //writing logic for extracting all the keys of map - wordCount map:
        Set<String> wordsInString = wordCount.keySet();

        //start for loop though all the words in wordCount
        for(String word: wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word + " : " + wordCount.get(word));
            }
        }

















    }
}
