package com.athang.javatraining.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        RemoveVowelsFromString demo = new RemoveVowelsFromString();
        demo.execute();
    }

    private void execute() {
        removingVowelLettersUsingCharArray();
        removingVowelLettersUsingStringArray();

    }

    private void removingVowelLettersJayPrakashSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you Name: ");
        String name = scanner.nextLine();
        char vowel;
        char notVowel;
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();
        char[] c = lowerCase.toCharArray();
        char[] cc = upperCase.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                vowel = c[i];
            } else {
                notVowel = c[i];
                System.out.print(notVowel);
            }
        }
    }

    private void removingVowelLettersUsingStringArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you Name: ");
        String name = scanner.nextLine();
        // Problem is to remove the vowel letters from a given word.
        // 1. array of my name
        // 2. array of vowels letters
        // 3. Empty array for output
        // 4. check the name aganist vowel letters and add not vowel letters in the  output array.
        // 5. convert output array to string and print the string.
        String[] nameArray = new String[100];  // Sanjay => {'S', 'a', 'n', 'j', 'a', 'y'}
        for(int i = 0; i < name.length(); i++){
            nameArray[i] = String.valueOf(name.charAt(i));
        }

        String vowelLettersArray[] = {"a", "e", "i", "o", "u"};
        String outputArray[] = new String[100];

        int outPutCounter = 0;
        for(int i = 0; i< nameArray.length; i++){
            if(!Arrays.asList(vowelLettersArray).contains(nameArray[i])){
                outputArray[outPutCounter++]=nameArray[i];
            }
        }
        String outputString = "";
        for(int i = 0; i< outputArray.length;i++){
            if(outputArray[i]!=null) {
                outputString += outputArray[i];
            }
        }
        System.out.println(outputString);
    }

    private void removingVowelLettersUsingCharArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you Name: ");
        String name = scanner.nextLine();
        // Problem is to remove the vowel letters from a given word.
        // 1. array of my name
        // 2. array of vowels letters
        // 3. Empty array for output
        // 4. check the name aganist vowel letters and add not vowel letters in the  output array.
        // 5. convert output array to string and print the string.

        char nameArray[] = name.toCharArray();   // Sanjay => {'S', 'a', 'n', 'j', 'a', 'y'}

//        char vowelLetters[] = new char[5];
//        vowelLetters[0] = 'a' ;
//        vowelLetters[1] = 'e' ;
//        vowelLetters[2] = 'i' ;
//        vowelLetters[3] = 'o' ;
//        vowelLetters[4] = 'u' ;

        char vowelLettersArray[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E','I','O','U'};

        char outPutArray[] = new char[100];

        int counter=0;
        for (int i = 0; i < nameArray.length; i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowelLettersArray.length; j++) {
                if (nameArray[i] == vowelLettersArray[j]) {
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel){
                outPutArray[counter++] = nameArray[i];
            }
        }

        String nameWithoutVowels = "";
        for (int i = 0; i < outPutArray.length; i++) {

                nameWithoutVowels += outPutArray[i];

        }
        System.out.println(nameWithoutVowels.replace("\u0000", ""));
    }

}