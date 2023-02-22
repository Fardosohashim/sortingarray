package sortingArrays;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {

        int[] array ={3,89,56,34,1,5,23,67,78,42,9};

        Arrays.sort(array);

//        for ( int i : array) {
//            System.out.println(i);
//        }

        String[] names ={
                "Irene", "Wendy","Felix","Abdi","Kauthar","Melany",
                "Alex","Winfred","Calvin","Bien","Kevin"
        };

        System.out.println("before sorting: ");
        for (String i : names){
            System.out.println(i);
        }

        Arrays.sort(names);
        System.out.println("After sorting the arrays");
        for (String i : names){
            System.out.println(i);
        }
    }

}
