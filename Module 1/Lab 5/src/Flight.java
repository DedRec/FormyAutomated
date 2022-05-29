import java.util.Random;
public class Flight {
    private int numSeats;
    private String validTicketIDs[];
    Random rand= new Random();
    public Flight(int numSeats,String validTicketIDs[]){
        this.numSeats=numSeats;
        this.validTicketIDs=validTicketIDs;
    }
    public String bookTicket(){
        try {
            if(numSeats>0) {
                numSeats -= 1;
                int random = rand.nextInt(validTicketIDs.length);
                return validTicketIDs[random];
            }
            else{
                return"No Available Seats";
            }
        }
        catch(Exception e){
            return "Try again";
        }
    }
    public void returnTicket(String TicketID) throws InvalidTicketException {
        boolean found=false;
        for(int i=0;i<validTicketIDs.length;i++) {
            if(TicketID.equals(validTicketIDs[i])){
                numSeats+=1;
                found=true;
            }
        }
        try {
            if (found == false) {
                throw new InvalidTicketException("Invalid Ticket ID, please enter a Valid Ticket ID");
            }
        } catch (InvalidTicketException e) {
            System.out.println("Invalid Ticket ID, please enter a Valid Ticket ID");
        }
    }
    public static void main(String[] args) throws InvalidTicketException {
        String Tickets[]={"A","B","C","D","E"};
        Flight flight1= new Flight(5,Tickets);
        System.out.println(flight1.bookTicket());
        System.out.println(flight1.bookTicket());
        System.out.println(flight1.bookTicket());
        flight1.returnTicket("Z");
        System.out.println(flight1.bookTicket());
        System.out.println(flight1.bookTicket());
        System.out.println(flight1.bookTicket());
    }

}
