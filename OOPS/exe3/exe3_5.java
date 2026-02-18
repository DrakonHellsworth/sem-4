//Print values of int, float, char, boolean using printf().
class exe3_5
{
    public static void main(String args[])
    {
        int a=17;
        float b=3.14f;
        char c='A';
        boolean d=true;
        System.out.printf("Integer: %d\n", a);
        System.out.printf("Float: %.2f\n", b);
        System.out.printf("Character: %c\n", c);
        System.out.printf("Boolean: %b\n", d);
    }
}
//Observation: The program uses System.out.printf() to format and print the values of different data types (int, float, char, boolean) using appropriate format specifiers (%d for int, %.2f for float, %c for char, and %b for boolean). The output is displayed to the user as specified in the print statements.