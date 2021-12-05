package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int test = in.nextInt();
       // System.out.println(test);
        System.out.println();
        System.out.println(test % 2);
        System.out.println("Введённое число является степенью 2?" );
        System.out.println(test == 0);
        in.close();

    }
}
