import java.util.Scanner;

class Regestration
{
    public static void main(String[] args)
    {
        Tickets t=new TicketsIMPL();
        Scanner s=new Scanner(System.in);
        while(true)
        {
        System.out.println("1.BOOK TICKET\n2.CANCEL TICKET\n3.AVAILABLE TICKETS\n4.exit");
        int c=s.nextInt();
        switch(c)
        {
            case 1:t.bookticket();
            break;
            case 2:t.cancelticket();
            break;
            case 3:t.availableticket();
            break;
            case 4:System.exit(0);
            default:System.out.println("invalid choice");
        }
        
    }
}
}