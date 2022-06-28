import java.util.Arrays;
import java.util.Comparator;

public class CityScheduleCost {


    public static void main(String[] ssss) {
        int grid[][] = new int[][]{
                {10,20}
                        ,{30,200}
                        ,{400,50}
                        ,{30,20}   };


//        Arrays.sort(grid, new Comparator<int[]>() {
//            @Override
//            public int  compare(int[] o1, int[] o2) {
//
//                if(Math.abs(o1[1]-o1[0])<Math.abs(o2[1]-o2[0]))
//                    return 1;
//                else if (Math.abs(o1[1]-o1[0])>
//                        Math.abs(o2[1]-o2[0])) {
//                    return -1;
//                }
//                else
//                    return 0;
//            }
//        });
        Arrays.sort(grid,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int result = 0 ;
        for(int i =0;i<grid.length;i++)
        {

          result = result + (i<(grid.length/2)?grid[i][0]:grid[i][1]);
        }
        System.out.println(result);
    }

}
