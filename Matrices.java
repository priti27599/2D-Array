import java.util.*;

public class Matrices{
    public static boolean search(int matrix[][], int key){
        for(int i=0;i< matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }

    public static void minmax(int matrix[][]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0 ;i<matrix.length;i++)
        {
            for(int j=0; j<matrix[0].length;j++)
            {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum Value is: "+ max);
        System.out.println("Minimum Value is: "+ min);
    }
    public static void main(String args[]){
        int matrix[][] = new int[4][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n;i++)
        {
            for(int j=0 ;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(search(matrix, 7));

        minmax(matrix);
    }
}