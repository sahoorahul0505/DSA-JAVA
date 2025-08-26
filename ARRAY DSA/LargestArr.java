// Largest Number in Array-->

public class LargestArr {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; // -♾️ / initialize with -infinity
        for(int i = 0; i < number.length; i++){
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

public static int getSmallest(int number[]){
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < number.length; i++){
        if (smallest > number[i]) {
            smallest = number[i];
        }
    }
    return smallest;
}


    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};

        int largenum = getLargest(number);
        System.out.println("the smallest number is : "+ getSmallest(number));
        System.out.println("the largest number is : "+ largenum);
    }
}
