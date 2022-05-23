public class SelecationSort {



    public  static  void  main (String[] args)
    {
        int[] arr = new int[]{6,5,4,3,2,1};

        for(int i=0;i<arr.length;i++)
        {
             int min =i;
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[j]<arr[i])
                     min = j;
             }
             int temp = arr[min];
             arr[min]=arr[i];
             arr[i]= temp;
        }


        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
