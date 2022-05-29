/* Seifeldin Sameh Mostafa Mohamed Elkholy 19P3954*/

public class Order {
    int noItem;
    float itemPrice;
    final int orderSerial;
    static int availableItems=100;
    static int counter=1;
    Order(int noItem,float itemPrice){
        this.orderSerial=counter;
        counter++;
        if(availableItems>=noItem){
            this.noItem=noItem;
            this.itemPrice=itemPrice;
            availableItems-=noItem;
        }
        else{
            this.noItem=0;
            this.itemPrice=0;
        }
    }
    public void displayOrder(){
        System.out.println("Order Serial: "+orderSerial+", no of items in order: "+noItem+", total order price "+itemPrice*noItem);
    }
    public void extend(int x){
        availableItems+=x;
    }
    public static void main(String[] args){
        Order o=new Order(10,2.5f);
        System.out.println("Available items "+o.availableItems);
        o.displayOrder();
        Order o2=new Order(5,3f);
        System.out.println("Available items "+o.availableItems);
        o2.displayOrder();
        o.extend(100);
        System.out.println("Available items "+o.availableItems);
        Order o3=new Order(200,1f);
        o3.displayOrder();
    }
}
