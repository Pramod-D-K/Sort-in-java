/*
best TC = O(n)
worst TC = O(n2)
space C=O(n);
 */
import java.util.Scanner;
public class Bubble_sort {
    public static void fun(int arr[]) {
        int n=arr.length;
        for (int it = 0;it<n-1;it++){
            int st=0;
            int en=n-it-1;
            for (int j=st;j<en;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
