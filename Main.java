import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*1-Write a Java program that accept three numbers from the user and print the largest number .*/
//        System.out.println("Enter the number 1: ");
//        int number1 = input.nextInt();
//        System.out.println("Enter the number 2: ");
//        int number2 = input.nextInt();
//        System.out.println("Enter the number 3: ");
//        int number3 = input.nextInt();
//        if (number1 > number2 ) {
//            System.out.println("largest number: " +number1);
//        }else if (number2 > number3 ) {
//            System.out.println("largest number: " +number2);
//        }else  {
//            System.out.println("largest number: " +number3);
//        }
        /*2-Write a Java program that accept a String and a number from the user,then print the character in the given index .
         */
//        System.out.println("Enter the string:");
//        String word = input.next();
//        System.out.println("Enter the number:");
//        int num = input.nextInt();
//         String ch= "";
//        for (int i = 0; i <= word.length(); i++) {
//            if (word.charAt(i) == num) {
//                ch = ch + word.charAt(i);
//            }
//
//        }
        /*3- Write a program to enter the numbers till the user wants and at the end it should display the sum entered   */
//        System.out.println("please enter the number1: ");
//        int number1 = input.nextInt();
//        System.out.println("please enter the number2: ");
//        int number2 = input.nextInt();
//        int sum=0;
//        String s="Y";
//        while (s.equalsIgnoreCase("Y")) {
//            System.out.println("please enter the number1: ");
//            number1 = input.nextInt();
//            System.out.println("please enter the number2: ");
//            number2 = input.nextInt();
//            if (number1==0){
//                System.out.println("you cant complete ");
//            }
//        }
//        sum=number1+number2;
//        System.out.println(sum);
        /*4-Write a Java program to find positive and negative numbers of a given array: */
//        int [] values={10,-21,30,31,-25};
//        for(int n:values){
//            if(n>0){
//                System.out.println(n + " is a Positive number");
//            } else if (n<0) {
//                System.out.println(n + " is a Negative number");
//            }else{
//                System.out.println(n + " is a Zero");
//            }
//
//        }
        /*5-Write a Java program to find a shortest word of a given array:- Original Array:
    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
    - Expected Output:
     JAVA **/
        String [] words={"Tuwaiq","Bootcamp","Student","JAVA"};
        System.out.println(Arrays.toString(words));
        for(String s:words){

            if(words.length<=4){
                System.out.println(s);
            }
        }
        System.out.println(words);

        }


    }
