/**
 * Ticket_booking
 */
import java.util.Scanner;
public class Ticket_booking {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stadium[] s = new Stadium[2];
            for(int i=0;i<s.length;i++)
            {
                System.out.println("Enter Venue ");
                s[i] = new Stadium(sc.nextLine());
                System.out.println("Enter Home Team ");
                s[i].setTeam_home(sc.nextLine());
                System.out.println("Enter Away Team ");
                s[i].setTeam_away(sc.nextLine());
                System.out.println("Enter Sponsers ");
                s[i].setSponsers(sc.nextLine());
                System.out.println("Enter Audience_capacity ");
                s[i].setAudience_capacity(sc.nextInt());
                System.out.println("Enter base price ");
                s[i].setOriginalTicket_price(sc.nextInt());
                sc.nextLine();
            }
            Customer[] c = new Customer[4];
            for(int i=0;i<c.length;i++)
            {
                c[i] = new Customer();
                c[i].setTicket_number();
                System.out.println("Enter Your name ");
                c[i].setCustomer_name(sc.nextLine());
                System.out.println("Enter Your Age ");
                c[i].setCustomer_age(sc.nextLine());
                System.out.println("Enter Your City ");
                c[i].setCustomer_city(sc.nextLine());
                System.out.println("Enter Stadium name ");
                String stadium_venue = sc.nextLine();
                c[i].setStadium(c[i].valid(s, stadium_venue));
                c[i].setSeat_number_cust();
                c[i].setTicket_price_cust();
            }
            Customer ca = new Customer();
            ca.display(c);
        }
    }
}
