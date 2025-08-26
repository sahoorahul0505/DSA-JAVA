public class reverse {
    public static void main(String[] args) {

            // *** print the reverse
        // int n = 10899;

        // while (n>0) {
        //     int lastdigit = n%10; // for find the last digit of the number , find its modulo with 10.
        //     System.out.print(lastdigit);
        //     n = n/10; // for removing the last digit of the number, divit num by 10.
        // }
        // System.out.println();

        // reverse the given number

        int n = 10899;
        int rev=0;

        while (n > 0) {
            int lastdigit = (n % 10);
            rev = (rev * 10) + lastdigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
