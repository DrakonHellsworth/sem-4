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
