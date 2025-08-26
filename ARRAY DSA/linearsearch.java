public class linearsearch {
    public static int foundNumbers(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if( numbers[i] == key){
                return i;
            }
        }
        return -1; // not exist
    }

    public static int foundString(String[] item, String key2){
        for(int i = 0; i < item.length; i++){
            // if(item[i] == key2) --> error! --> string can not converted to String
            if(item[i].equals(key2)){  // String Comparison: Use .equals() instead of == for comparing strings in Java. == checks for reference equality, whereas .equals() checks for value equality.
                return i;  // return the index of the found string
            }
        }
        return -1;  // return -1 to indicate the key was not found
    }
    

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String item[] = {"car", "cycle", "plane", "jet"};
        int key = 10;
        String key2 = "cycle";
        int index = foundNumbers(numbers, key);
        int index2 = foundString(item, key2);

        if(index == -1 || index2 == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("the number " + key + " present at index : "+ index);
            System.out.println("the item " + key2 + " present at index : "+ index2);
        }
        
    }
}
