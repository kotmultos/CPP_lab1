package cpp.lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        int n = scanner.nextInt();
        System.out.println("You entered: " + n);
        System.out.println("Your data is being processed now, please wait...");

        String result = Calculate.series(n);
        System.out.println(result);
    }
}
