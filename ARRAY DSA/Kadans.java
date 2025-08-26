public class Kadans {
    // max sum of sub array best approch kadan,s algorithm
    public static void kadans(int numbers[]){
        int ms = Integer.MIN_VALUE;   // ms = Maximum sum
        int cs = 0;                   // cs = Current sum
        boolean allNegative = true;  // Flag to check if all elements are negative
        int maxNegative = Integer.MIN_VALUE;  // Store the maximum negative value


        for(int i = 0; i < numbers.length; i++){
            // if all elements are -ve then return smallet -ve element
            if (numbers[i] >= 0) {
                allNegative = false;
            }
            if (numbers[i] > maxNegative) {
                maxNegative = numbers[i];
            }

            cs = cs + numbers[i];
            if(cs < 0){ // if current sum is -ve then assign it as 0;
                cs = 0;
            }
            // compare cs with ms
            ms = Math.max(cs, ms);  // jobi max hoga ms me store hoga
        }

        if (allNegative) {
            ms = maxNegative;
        }

        System.out.println("maximum sum of sub array = " + ms);
    }

// cd D:\DSA JAVA CODE VSC\ARRAY DSA

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadans(numbers);

        int numbers2[] = {-8, -3, -6, -2, -5, -4};
        kadans(numbers2);
    }
}
