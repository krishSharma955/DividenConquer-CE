package DividenConquer;

public class QuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++) {
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,7,2,-1,8,9};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
//Average Time Complexiity - O(nlogn)
//Worst TC - O(n^2), when in a sorted array, pivot is taken largest or smallest element
//Space Complexity - O(n)
