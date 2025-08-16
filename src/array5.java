//Find the duplicate in an array of N+1 integers.
public class array5 {
    static int find(int arr[])
    {
        int duplicate=-1;
        for(int i=0;i<arr.length;i++)
        {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0)
            {
                duplicate=index+1;
            }
            else {
                arr[index]=-arr[index];
            }
        }
        return duplicate;
    }
    public static void main(String args[])
    {
        int arr[] = {2, 3, 4, 2, 1};

        System.out.println(find(arr));
    }
}
