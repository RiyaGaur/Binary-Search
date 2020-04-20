import java.util.Scanner;

public class RecursiveBinarySearch {
    int[] arr;
    public RecursiveBinarySearch(int arr[]){
        this.arr=arr;
    }
    public int binarysearch(int searchelement,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(searchelement==arr[mid]){
                return mid;
            }
            else if (searchelement < arr[mid]) {
                return binarysearch(searchelement, low, mid - 1);
            }
            else{
                return binarysearch(searchelement, mid + 1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements in array in sorted way:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        RecursiveBinarySearch obj=new RecursiveBinarySearch(arr);
        System.out.print("Enter element to be search:");
        int searchelement=sc.nextInt();
        int result=obj.binarysearch(searchelement,0,arr.length-1);
        if(result==-1){
            System.out.println(searchelement+" not found ");
        }
        else {
            System.out.println(searchelement+" found");
        }
    }
}
