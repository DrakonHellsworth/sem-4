//2d arary and 3d array without libraries
class exe4g
{
    public static void main(String[] args) 
    {
        int a[][]={
        {1,2,3},
        {4,5,6}
        };
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("3d array");
    int b[][][]={
        {
            {1,2,3},
            {4,5,6}
        },
        {
            {7,8,9},
            {10,11,12}
        }
    };
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            for(int k=0;k<3;k++)
            {
                System.out.print(b[i][j][k]+" ");
            }
            System.out.println("  ");
        }
    }
    }
}
//Observation: The program demonstrates the use of 2D and 3D arrays in Java without using any libraries. It initializes a 2D array 'a' with 2 rows and 3 columns, and a 3D array 'b' with 2 blocks, each containing 2 rows and 3 columns. The program then uses nested loops to iterate through the elements of both arrays and prints them in a formatted manner. The output will display the elements of the 2D array followed by the elements of the 3D array in a structured format.