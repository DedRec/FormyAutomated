public class Flight extends Throwable implements Comparable<Flight> {
    int available_seats;
    String from,to;

    public Flight(int available_seats, String from,String to){
        this.available_seats=available_seats;
        this.from=from;
        this.to=to;
    }

    public void book(String from, String to) throws Exception {
        try {
            if (from.equals(this.from) == false || to.equals(this.to) == false) {
                throw new Exception("Wrong Source and/or destination. TRY another flight!!!");
            } else if (available_seats > 0) {
                System.out.println("Done");
            }
            else {
                throw new NoSeatsException("No available seats. TRY another flight!!!");
            }
        }
        catch(NoSeatsException e){
            System.out.println("No available seats. TRY another flight!!!");
        }
        catch(Exception e){
            System.out.println("Wrong Source and/or destination. TRY another flight!!!");
        }
    }

    @Override
    public int compareTo(Flight o) {
        if(this.available_seats>o.available_seats){
            return 1;
        }
        else if(this.available_seats<o.available_seats){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) throws Exception {
        Flight f1 = new Flight(10,"Cairo","Berlin");
        f1.book("Cairo","Berlin");
        f1.book("Cairo","Madrid");

        Flight f2= new Flight(0,"Cairo","Berlin");
        f2.book("Cairo","Berlin");
        System.out.println(f1.compareTo(f2));
        System.out.println(f2.compareTo(f1));
    }
}
