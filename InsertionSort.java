public class InsertionSort {




    public  static  void  main (String[] args)
    {
        int[] arr = new int[]{6,5,4,3,2,1};
        int i,j,value;
        for( i=1;i<=arr.length-1;i++)
        {
            value = arr[i];
           j= i;
           while (arr[j-1]>value && j>=1)
           {
               arr[j] = arr[j-1];
               j--;
           }
           arr[j]= value;
        }


        for(int  k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }

    }
}
