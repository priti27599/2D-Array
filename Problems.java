
public class Problems{
    public static void transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposeArray = new int [col][row];

        for(int i=0 ;i<row;i++)
        {
            for(int j=0 ;j< col;j++){
                transposeArray[j][i]= matrix[i][j];
            }
        }
        printArray(transposeArray);
    }

    public static void printArray(int [][] matrix){
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0; j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // int array[][]={{4,7,8},
        //                 {8,8,7}};

        // int count=0;
        // for(int i=0; i<array.length;i++){
        //     for(int j=0; j<array[0].length;j++)
        //     {
        //         if(array[i][j]==8)
        //         {
        //             count++;
        //         }
        //     }
        // }                
        // System.out.println(count);

        // int nums[][]={{1,4,9},{11,4,3},{2,2,3}};

        // int sum =0;
        // for(int j=0; j<nums[0].length;j++)
        // {
        //     sum +=nums[1][j];
        // }
        // System.out.println(sum);

        int row = 2, column=3;
        int [][] matrix = {{2,3,7},{5,6,7}};

        transpose(matrix);
    }
}