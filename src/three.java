import java.util.Scanner;

public class three {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Score: ");
        int num = input.nextInt();

        score(num);
    }

    public static void score(int number) {

//        for(int i=0; i<number;i++){

        if (number >= 90)
            System.out.println("A");
        else if (number >= 80 && number < 90)
            System.out.println("B");
        else if (number >= 70 && number < 80)
            System.out.println("C");
        else if (number >= 60 && number < 70)
            System.out.println("D");
        else
            System.out.println("F");

    }

    }
















