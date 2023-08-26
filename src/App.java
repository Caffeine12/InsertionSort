import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[]={10, 8, 12, 14, 6, 16};
        int swap=0;
        for(int i=1;i<=arr.length-1;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
