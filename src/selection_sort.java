/*
best TC =O(n2);
worst TC = O(n2);
SC = O(1);
 */


import java.util.Scanner;

public class selection_sort {
    public static void fun(int arr[]) {
        int n=arr.length;

        for (int i=0;i<n;i++){
            int minval=arr[i];
            int index = i;
            for (int j=i;j<n;j++){
                if(arr[j]<minval){
                    minval=arr[j];
                    index=j;
                }
            }
            int temp= arr[i];
            arr[i]=minval;
            arr[index]=temp;
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
