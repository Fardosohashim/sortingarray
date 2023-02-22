package sortingArrays;

import java.util.Scanner;

public class logicClass {

    public static boolean finder(int item, int [] arr) {

        boolean found = false;

        int times =0;
        for (int datum : arr) {
            if (item == datum) {
                found = true;
                times++;

            }

        }

        System.out.println("It was found "+times+" times ");
        return  found;
    }

    public static void main(String[] args) {
        int[] data ={3,89,56,34,1,5,23,67,78,56,34,38,28,15,23,56,34,78,45};


        for (int i = 0; i < data.length; i++){
            for (int j = i+1; j< data.length;j++){
                int k = 0;
                if (data[i]> data[j]){
                    k= data[i];
                    data[i]= data[j];
                    data[j]=k;
                }
            }

            System.out.println(data[i]);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wish to look for: ");
        int numericalNumber = sc.nextInt();

        if (finder(numericalNumber, data)){
            System.out.println("WE found it" );
        }else {
            System.out.println("WE found nothing");
        }



    }



}
