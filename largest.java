public class largest {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 5;
        int a3 = 2;
        int larg;
        if (a1 >= a2 && a1>= a3) {
            larg = a1;
        }
        else if (a2 >= a3) {
            larg = a2;
        }
        else{
            larg = a3;
        }

        System.out.println("The largest number is : " + larg);
    }
}
