import java.util.Scanner;

public class NonRecursiveBinarySearch {
    int[] arr;
    public NonRecursiveBinarySearch(int arr[]){
        this.arr=arr;
    }
    public int binarysearch(int searchelement){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(searchelement==arr[mid]){
                return mid;
            }
            else if (searchelement < arr[mid]) {
                high=mid-1;
            }
            else{
                low=mid+1;
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
        NonRecursiveBinarySearch obj=new NonRecursiveBinarySearch(arr);
        System.out.print("Enter element to be search:");
        int searchelement=sc.nextInt();
        int result=obj.binarysearch(searchelement);
        if(result==-1){
            System.out.println(searchelement+" not found ");
        }
        else {
            System.out.println(searchelement+" found");
        }
    }
}
