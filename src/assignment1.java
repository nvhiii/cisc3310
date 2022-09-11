import java.util.Scanner;

public class assignment1 {

    public static void main(String[] args) {

        int firstNumAdd, secondNumAdd, sum, product;


        System.out.println("Welcome to the program for adding and multipling for Professor Komeh's class!");
        // greeting

        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter the first number: ");

        firstNumAdd = stdin.nextInt();

        System.out.println("Please enter the second number: ");

        secondNumAdd = stdin.nextInt();
        // inputs

        sum = firstNumAdd + secondNumAdd;
        product = firstNumAdd * secondNumAdd;

        System.out.println("Your sum is: " + sum);
        System.out.println("Your product is: " + product);

    }
}
