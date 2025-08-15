public class array1 {
    static void find(int arr[])
    {
        int low=0; int mid=0; int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,0,2,1,1,0};
        find(arr);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
