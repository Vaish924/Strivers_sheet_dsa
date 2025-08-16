//Kadanes algo to alculte max sum of any subarray
public class array4 {
    static int find(int[] arr)
    {
        int sum=0;
        int max=arr[0];
        for(int i:arr)
        {
            sum+=i;
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int[] arr={-1,5,-2,6,-7,4,5};
        System.out.println(find(arr));
    }
}
