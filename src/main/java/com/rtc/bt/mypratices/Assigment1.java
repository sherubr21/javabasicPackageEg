import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Assigment1 {

    public void question1() {
        int a = -5, b = 8, c = 6, d = 55, e = 9, f = 9;

        int ans1 = a + b * c;
        int ans2 = (d + e) % f;

        int ans3 = 20 + -3 * 5 / 8;

        System.out.println("ans of a:" + ans1);
        System.out.println("ans of b:" + ans2);
        System.out.println("ans of c:" + ans3);
        System.out.println("ans of d:" + (5 + 15 / 3 * 2 - 8 % 3));


    }

    public void question2() {
        System.out.println("+''''''+");
        System.out.println("[| 0 0 |]");
        System.out.println(" |  ^  |");
        System.out.println(" |'--' |");
        System.out.println("---------");

    }

    public void question3() {
        int i;
        for (i = 3; i < 100; i += 3) {
            System.out.println("No. is mutiple 3:" + i);
        }
        for (i = 5; i < 100; i += 5) {
            System.out.println("No. is mutiple 5:" + i);
        }
        for (i = 3; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("No. is mutiple 5 And 3:" + i);
            }

        }


    }

    public void question4() {
        String[] words = {"cat", "flag", "green", "test", "Athang"};
        String[] words1 = {"cat", "dog", "red", "is", "am"};

        List<String> longWords = getLongWords(words, 5); // Threshold is 5 characters
        List<String> longWords1 = getLongWords(words1, 2);
        System.out.println("Long words:");
        for (String word : longWords) {
            System.out.println(word);
        }
        for (String word1 : longWords1) {
            System.out.println(word1);
        }

    }

    public void question5(int[] arr) {

        int count = 0;
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero
            if (arr[i] != 0) {
                // Move the non-zero element to the position tracked by count and increment count
                arr[count++] = arr[i];
            }
        }

        // Fill the remaining positions in the array with zeroes
        while (count < n) {
            arr[count++] = 0;
        }




    }
    public void switchpratic(){
        //int input=0;
        System.out.println("enter choices:");
        Scanner scn= new Scanner(System.in);
        int input=scn.nextInt();
        switch (input){
            case 1:System.out.println("mon");
            break;
            case 2:System.out.println("tue");
                break;
            default:System.out.println("wed");
        }

       // switch ()
    }
    public void whileOrdowhile(){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int inpt=sc.nextInt();
        int count=1;
        while(count<11){
            System.out.println(inpt+" X "+count+"="+(inpt* count));
            count++;

        }

        System.out.println("enter the number1");
        Scanner sc1=new Scanner(System.in);
        int inpt1=sc.nextInt();
        int count1=1;
        do{
            System.out.println(inpt1+" X "+count1+"="+(inpt1* count1));
            count1++;

        }while(count1<11);


        int ar[] = { 10, 50, 60, 80, 90 };
        System.out.print("foreach eg : ");

        for (int element : ar)

            System.out.print(element + " ");

        int n=5;
        for(int i=2;i<=20;i+=2){
            if(n==12&&i>10){
                //if()
                break;
            }
            System.out.println(n*i);
        }
        int[] a = {1, 2, 3, 6};
        int last=a[0];
        int n1 = a.length;


        for (int i = 0; i < n1 - 1; ++i) {
            a[i] = a[i + 1];
        }


        a[n1 - 1] = last;


        System.out.println(Arrays.toString(a));

        int arrs[] = new int[10];
        int startingNumber = 5;
        int increment = 5;
        for(int i=0; i< arrs.length; i++){
            if(i==0){
                arrs[i] = startingNumber;
            }else{
                arrs[i] = startingNumber + increment;
            }
            startingNumber = arrs[i];
        }

        for(int i=0; i< arrs.length;i++){
            System.out.println(arrs[i]);
        }





    }
    public void question6(){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();


        System.out.print("Input hour: ");
        int hour = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();


        double totalTimeInSeconds = hour * 3600 + minutes * 60 + seconds;


        double speedInMetersPerSecond = distance / totalTimeInSeconds;
        double speedInKmPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);
        double speedInMilesPerHour = (distance / 1609) / (totalTimeInSeconds / 3600);


        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedInKmPerHour);
        System.out.println("Your speed in miles/h is " + speedInMilesPerHour);
        String name= "I name is sherub";


        scanner.close();
    }
    public static List<String> getLongWords(String[] words, int threshold) {
        List<String> longWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > threshold) {
                longWords.add(word);
            }
        }

        return longWords;
    }
    public static void main(String args[]){
        Assigment1 obj=new Assigment1();
        obj.question1();
        obj.question2();
        obj.question3();
        obj.question4();

        int[] arr = {0, 3, 4, 0, 1, 2, 5, 0};
        obj.question5(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        obj.switchpratic();
        obj.whileOrdowhile();
        obj.question6();


    }


}
