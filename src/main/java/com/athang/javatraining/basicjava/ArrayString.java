package com.athang.javatraining.basicjava;

public class ArrayString {
    public static void main(String[] args) {
        ArrayString arrayString = new ArrayString();
        arrayString.execute();
    }
    private void execute() {
        findTheLongestWords(new String[]{"cat", "flag", "green", "test", "Athang"});
        findTheLongestWords(new String[]{"cat", "dog", "red", "is", "am"});
    }
    private void findTheLongestWords(String[] words) {
        int longestLength=0;
        for(int i=0;i<words.length-1;i++){
            if(words[i].length() < words[i+1].length()){
                longestLength=words[i+1].length();
            }
            if(longestLength==0){
                longestLength=words[i].length();
            }
        }
        System.out.println(longestLength);
        String longestWords="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()==longestLength){
                longestWords += words[i]+", ";
            }
        }
        System.out.println(longestWords);
    }
}
