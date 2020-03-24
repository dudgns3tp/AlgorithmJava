package DFSBFS;

import java.util.*;
import java.util.Queue;

public class wordLadder {
    public static void main(String[] args){
        String[] words= {"hot", "dot", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);
        wordLadder a = new wordLadder();
        System.out.println(a.ladderLength_neighbor("hit", "cog", wordList));
    }

    public int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList){
        if(wordList==null || !wordList.contains(endWord))
            return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);//중복 허용하지 않는 저장장치 SET
        queue.offer(beginWord);
        dict.add(endWord);
        dict.remove(beginWord);
        int level = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                String str = queue.poll();

                for(String neighbor: neighbors(str,wordList)){
                    queue.offer(neighbor);
                }
            }
            level++;
        }
        return 0;

    }

    public List<String> neighbors(String s, List<String> wordList){

        List<String> res = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);

        for(int i=0; i<s.length(); i++){
            char[] chars = s.toCharArray();
            for(char ch='a'; ch<='z'; ch++){
                chars[i]=ch; // ait ~ zit
                String word = new String(chars);
                if(dict.remove(word)){
                    res.add(word);
                }
            }
        }
        return res;
    }
}
