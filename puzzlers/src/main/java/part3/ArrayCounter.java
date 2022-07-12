package part3;

public class ArrayCounter{

    public static int countArray(int[] array){
        int total = 0;
        for(int i = 1; i < array.length; i++){
            total += array[i];
        }
        return total;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3};
        int total = countArray(array);
        System.out.println("The total is: " + total);
    }
}
