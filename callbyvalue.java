public class callbyvalue {
    public static void swap(int a, int b){ // this is the copy of actual parameter
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println(" a  = " + a); // only change in copy not in original value
        System.out.println(" b = " +b);

    }
    public static void main(String[] args) {
        // swap by value exchange
        int a = 5;
        int b = 10;
        swap(a, b);
        // here no changes in actual parameter
        System.out.println("No changes in actual parameter or values ");
        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
}
