/*
best TC =O(n) for already sorted array;
worst TC = O(n2);
SC = O(1);
 */

import java.util.Scanner;

public class Insertion_sort {
    public static void fun(int arr[]) {
        int n=arr.length;

        for (int i=1;i<n;i++){
            int key= arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        fun(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
