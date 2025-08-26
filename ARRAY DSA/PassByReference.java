public class PassByReference {
    public static void update(int mark[], int nonChangable){
        nonChangable = 10;  // not change in main function
        for(int i = 0; i < mark.length; i++){
            mark[i] = mark[i] + 1;
        }
        
    }


    public static void main(String[] args) {
        int mark[] = {97, 98, 99};
        int nonChangable  = 5; // not change in main function
        update(mark,nonChangable);
        System.out.println(nonChangable);

        // print our marks , original value changed
        for(int i = 0; i < mark.length; i++){
            System.out.print(mark[i] + " ");
        }
        System.out.println();
    }
}
