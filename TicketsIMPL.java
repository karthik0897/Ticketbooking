import java.util.Scanner;

class TicketsIMPL implements Tickets
{   
    Scanner scn=new Scanner(System.in);
    int Tickets=50;

    public void bookticket()
    {
        System.out.println("enter the number of tickets =");
        int bookticket=scn.nextInt();
        if(bookticket>Tickets)
        {
            System.out.println("tickets not availbale");
        }
        else{
            Tickets=Tickets-bookticket;
            System.out.println("your "+bookticket+"tickets is booked");
        }
    }
    public void cancelticket()
    {
        System.out.println("enter the number of tickets to be cancelled");
        int cancelticket=scn.nextInt();
        if(cancelticket>Tickets)
        {
            System.out.println("enter the valid number of tickets");
            
        }
        else
        {
            Tickets=Tickets+cancelticket;
            System.out.println("cacellation successfull"+Tickets);
        }
    }
    public void availableticket()
    {
        System.out.println("available tickets is "+Tickets);
    }
}