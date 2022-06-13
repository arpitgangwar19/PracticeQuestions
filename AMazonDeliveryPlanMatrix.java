
//Question : Amazon Fresh is a grocery delivery service that offers consumers the option of purchasing their groceries online and having them delivered on schedule.
//        The amazon fresh truck is planning a route for a delivery truck to delver customers order in the city of techlandia.
//        The planner willl create a delivery area for each order to effectively plan the route.
//        Thev area is abstracted as a grid. Not all locations are accesssible by the road. The truck only need to make a single delivery.
//
//Assumptions : Some places in the delivery area cannot be accessed by the driver, as there are no roads in those location.
//          2. the delivery area can be represented as a two dimensional grid of integers where each integer represents location of one cell.
//3. the truck must start from the top left corner of area which is always accessible ad can move one cell up and left and down and right at a time.
//4. the truck must navigate arpund the area without the roads adn can not leave the area.
//5. the accessible area are represented as 1, and without roads are represented as 0, and the order destination is represented as 9.
//
//Input : { 1, 0, 0 },
//        { 1, 0, 0 },
//        {1, 9 , 1 }
//Output : 3
import java.util.ArrayList;
import java.util.List;

public class AMazonDeliveryPlanMatrix {


    public static void main(String[] args)
    {
        int m = 3;
        int n = 3;
        int mat[][] = {
                        { 1, 1, 1 },
                        { 1, 0, 1 },
                        {9,  1, 1 }
        };
        List<Integer> list = new ArrayList<>();
        int result = 0;

//        printMatrix(mat, m-1, n-1, 0, 0);
        int count =0;
         result = printMatrix(mat,m,n,0,0,count);
    }

    private static int  printMatrix(int mat[][], int m, int n,
                                    int i, int j,int count) {


//        if(i<0 || j<0  || j==n || i==m )
//             return 0;
//        if(mat[i][j]==0)
//            return 0;
//        if(mat[i][j]==1)
//        {
//            int left =   printMatrix(mat,m,n,i,j-1,count);
//            int up =     printMatrix(mat,m,n,i-1,j,count);
//            int down =   printMatrix(mat,m,n,i+1,j,count);
//            int right =  printMatrix(mat,m,n,i,j+1,count);
//
//        }
//
//
//        if(mat[i][j]==9)
//            return count;
//
//
//
//
//
//return 1+Math.max(Math.max(left,right),Math.max(up,down));


        if(i<0 || i>=mat.length || j<0|| j>=mat[0].length || mat[i][j]==0)
        {
            return 0;
        }
        if(mat[i][j]==9)
            return  count;
        if(mat[i][j]==1)
            count = count+1;
        return  printMatrix(mat,m,n,i+1,j,count)+
                printMatrix(mat,m,n,i-1,j,count)+
                printMatrix(mat,m,n,i+1,j,count)+
                printMatrix(mat,m,n,i,j+1,count);



    }
}
