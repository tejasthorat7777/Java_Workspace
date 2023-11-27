import java.util.Scanner;
class Booking {

    private int bookingid;
    private int noOfTickets;
    private double price,totalPrice;
    private String destination,cabinType;
    private long departureDate;
    private static int bookingCount = 1021001;

    Booking()
    {
        this.noOfTickets = 1;
        this.price = 15000;
        this.totalPrice = 15000;
        this.destination = "USA";
        this.cabinType = "First class";
        this.departureDate = 03042001;
    }

    public void setBookingId()
    {  
        this.bookingid = bookingCount;
        bookingCount =  bookingCount + noOfTickets;
    }
    public void setNoOfTickets(int noOfTickets)
    {
        this.noOfTickets = noOfTickets;
    }
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    public void setDepartureDate(long departureDate)
    {
        this.departureDate = departureDate;
    }
    public void setCabinType(String cabinType)
    {
        this.cabinType = cabinType;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getBookingId(){return bookingid;}
    public int getNoOfTickets(){return noOfTickets;}
    public double getPrice(){return price;}
    public double getTotalPrice(){ return (getNoOfTickets()*getPrice());}
    public String getCabinType(){return cabinType;}
    public String getDestination(){return destination;}
    public long getDepartureDate(){return departureDate;}


    public void displayDeatils(Booking booking[])
    {
       for(int i=0;i<booking.length;i++)
       {
            System.out.println("Booking id "+booking[i].getBookingId());
            System.out.println("No of Tickets "+booking[i].getNoOfTickets());
            System.out.println("Price "+booking[i].getPrice());
            System.out.println("Total Price "+booking[i].getTotalPrice());
            System.out.println("Destination "+booking[i].getDestination());
            //System.out.println("Deaprture Date "+booking.getDepartureDate());
            System.out.println("Cabin Type "+booking[i].getCabinType());
       }
    }
}

class App10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,num1,num2;
        System.out.print("Enter number of passengers who will book the ticket ");
        num = sc.nextInt();
        Booking booking[] = new Booking[num];
        Booking b1 = new Booking();
        for(int i=0;i<booking.length;i++)
        {
            booking[i] = new Booking();
            System.out.print("Enter number of passengers ");
            booking[i].setNoOfTickets(sc.nextInt());
            System.out.println("Enter destination ");
            System.out.println("press 1 for Nashik");
            System.out.println("press 2 for Pune");
            System.out.println("press 3 for Mumbai");
            System.out.println("press 4 for Delhi");
            num1 = sc.nextInt();
            switch (num1)
            {
                case 1:
                        booking[i].setDestination("Nashik");
                        System.out.println("Enter cabin type ");
                        System.out.println("Press 1 for Business Class");
                        System.out.println("Press 2 for First Class ");
                        System.out.println("Press 3 for Second Class ");
                        System.out.println("Press 4 for Ecomony Class ");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                booking[i].setPrice(40000);
                                booking[i].setCabinType("Business Class");
                                break;
                            case 2:
                                booking[i].setPrice(25000);
                                System.out.println("Press 2 for First Class ");
                                break;
                            case 3:
                                booking[i].setPrice(15000);
                                System.out.println("Press 3 for Second Class ");
                                break;
                            default:booking[i].setPrice(10000);
                            System.out.println("Press 4 for Ecomony Class ");
                                break;
                        }
                    break;
                case 2: 
                        booking[i].setDestination("Pune");
                        System.out.println("Enter cabin type ");
                        System.out.println("Press 1 for Business Class");
                        System.out.println("Press 2 for First Class ");
                        System.out.println("Press 3 for Second Class ");
                        System.out.println("Press 4 for Ecomony Class ");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                booking[i].setPrice(50000);
                                booking[i].setCabinType("Business Class");
                                break;
                            case 2:
                                booking[i].setPrice(35000);
                                booking[i].setCabinType("First Class");
                                break;
                            case 3:
                                booking[i].setPrice(18000);
                                booking[i].setCabinType("Second Class");
                                break;
                            default:booking[i].setPrice(8000);
                            booking[i].setCabinType("Economy Class");
                                break;
                        }
                    break;
                case 3: 
                        booking[i].setDestination("Mumbai");
                        System.out.println("Enter cabin type ");
                        System.out.println("Press 1 for Business Class");
                        System.out.println("Press 2 for First Class ");
                        System.out.println("Press 3 for Second Class ");
                        System.out.println("Press 4 for Ecomony Class ");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                booking[i].setPrice(60000);
                                booking[i].setCabinType("Business Class");
                                break;
                            case 2:
                                booking[i].setPrice(25000);
                                booking[i].setCabinType("First Class");
                                break;
                            case 3:
                                booking[i].setPrice(18000);
                                booking[i].setCabinType("Second Class");
                                break;
                            default:booking[i].setPrice(1000);
                            booking[i].setCabinType("Economy Class");
                                break;
                        }
                    break;
                default: 
                        booking[i].setDestination("Delhi");
                        System.out.println("Enter cabin type ");
                        System.out.println("Press 1 for Business Class");
                        System.out.println("Press 2 for First Class ");
                        System.out.println("Press 3 for Second Class ");
                        System.out.println("Press 4 for Ecomony Class ");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                booking[i].setPrice(90000);
                                booking[i].setCabinType("Business Class");
                                break;
                            case 2:
                                booking[i].setPrice(80000);
                                booking[i].setCabinType("First Class");
                                break;
                            case 3:
                                booking[i].setPrice(50000);
                                booking[i].setCabinType("Second Class");
                                break;
                            default:booking[i].setPrice(30000);
                            booking[i].setCabinType("Economy Class");
                                break;
                        }
                    break;
            }
            booking[i].setBookingId();
            //System.out.print("Enter departure date ");
            //booking.setDepartureDate(sc.nextLong());
        }
        b1.displayDeatils(booking);
    }
}
