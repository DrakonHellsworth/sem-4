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
//Observation: The program demonstrates the use of a switch-case statement to handle menu selection based on user input. The user is expected to provide a choice as a command-line argument, which is then parsed into an integer. The switch statement evaluates the choice and executes the corresponding case block, printing a message for each valid option (1, 2, or 3). If the user enters an invalid choice, the default case is executed, printing "Invalid choice".