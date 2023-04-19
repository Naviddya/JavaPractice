package Sort;

public class SortArray {

    public static void main(String[] args) {

        int arr[]={1,233,45,56,78};

        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {

            if(max>arr[i])
            {
                arr[i]=max;
                System.out.println(arr[i]);


            }

        }

    }
}
