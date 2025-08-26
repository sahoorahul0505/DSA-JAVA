import java.util.Scanner;

public class ArrayCC{
    public static void arraycc(){
        int marks[] = new int[50];

        // input syntax
        Scanner sc = new Scanner(System.in);

        // lenght of an array
        System.out.println("length of array : " + marks.length);

        // input the values in an arrray
        // marks[0] = sc.nextInt(); // 0th index --> phy
        // marks[1] = sc.nextInt(); // 1th index --> chem
        // marks[2] = sc.nextInt(); // 2th index --> math

        // // display the array elements
        // System.out.println("phy : "+ marks[0]);
        // System.out.println("chem : "+ marks[1]);
        // System.out.println("math : "+ marks[2]);

        // // update array
        // //marks[2] = 100;
        // marks[2] = marks[2] + 59;
        // System.out.println("after upadation : ");
        // System.out.println("math : "+ marks[2]);

        sc.close();
    }

    public static void main(String[] args) {
        arraycc();
    }
}