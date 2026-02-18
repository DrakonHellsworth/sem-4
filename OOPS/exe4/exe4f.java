// menu selection through switch case without libraries  
class exe4f
{
    public static void main(String[] args) 
    {
        int choice=Integer.parseInt(args[0]);
        switch(choice)
        {
            case 1:
            System.out.println("You selected option 1");
            break;
            case 2:
            System.out.println("You selected option 2");
            break;
            case 3:
            System.out.println("You selected option 3");
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}