public class Stadium
{
    private String venue,team_home,team_away,sponsers;
    private int audience_capacity,original_ticket_price;
    private final int umpire,team_staff;
    private String[] seat_number = new String[20];
    private int[] ticket_price = new int[20];
    private final String[] number = {"0","1","2","3","4","5","6","7","8","9"};
    private final String[] alphabet = {"A","B"};
    private int number_index = 0;
    private int alphabet_index = 0;
    private int ticket_price_index = 0;
    private int ticket_price_index_rev = 0;
    private int counter = 0;
    private int counter_rev = 0;
    private int seat_number_counter_cust = 0;
    public Stadium(String venue){
        this.venue = venue;
        this.team_home = "India";
        this.team_away = "Australia";
        this.sponsers = "Tata Trust";
        this.team_staff = 10;
        this.umpire = 4;
        this.audience_capacity = 60;
    };
    public void setVenue(String venue)
    {
        this.venue = venue;
    }
    public void setTeam_home(String team_home)
    {
        this.team_home = team_home;
    }
    public void setTeam_away(String team_away)
    {
        this.team_away = team_away;
    }
    public void setSponsers(String sponsers)
    {
        this.sponsers = sponsers;
    }
    public void setOriginalTicket_price(int original_ticket_price)
    {
        this.original_ticket_price = original_ticket_price;
    }
    public void setAudience_capacity(int audience_capacity)
    {
        this.audience_capacity = audience_capacity;
    }
    public void setSeat_number()
    {   
        this.seat_number[counter++] = number[number_index] + alphabet[alphabet_index++];
        if(alphabet_index == alphabet.length)
        {
            number_index++;
            alphabet_index = 0;
        }
    }
    public void setTicket_price(String seat)
    {   
        int temp_price = this.original_ticket_price;
        if(seat.startsWith("0")){
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("1")) {
            temp_price -= 500;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("2")) {
            temp_price -= 1000;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("3")) {
            temp_price -= 1500;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("4")) {
            temp_price -= 2000;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("5")) {
            temp_price -= 2500;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("6")) {
            temp_price -= 3000;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("7")) {
            temp_price -= 3500;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else if (seat.startsWith("8")) {
            temp_price -= 4000;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
        else{
            temp_price -= 4500;
            this.ticket_price[ticket_price_index++] = temp_price;
        }
    }

    public String getVenue(){return this.venue;}
    public String getTeam_home(){return this.team_home;}
    public String getTeam_away(){return this.team_away;}
    public String getSponsers(){return this.sponsers;}
    public int getTeam_staff(){return this.team_staff;}
    public int getUmpire(){return this.umpire;}
    public int getOriginalTicket_price(){return this.original_ticket_price;}
    public String getSeat_number_cust(){return this.seat_number[seat_number_counter_cust++];}
    public String getSeat_number(){return this.seat_number[counter_rev++];}
    public int getTicket_price(){return this.ticket_price[ticket_price_index_rev++];}

    public void display(Stadium[] s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.print("Venue of the Stadium "+s[i].getVenue());
            System.out.print("  Home Team "+s[i].getTeam_home());
            System.out.print("  Away Team "+s[i].getTeam_away());
            System.out.print("  Sponsers are "+s[i].getSponsers());
            System.out.print("  Number of team Staff "+s[i].getTeam_staff());
            System.out.print("  Number of Umpires "+s[i].getUmpire());
            System.out.println("    Base Ticket Price "+s[i].getOriginalTicket_price());
        }
    }
    public void display()
    {
        System.out.print("Venue of the Stadium: "+this.getVenue());
        System.out.print("  Home Team: "+this.getTeam_home());
        System.out.print("  Away Team: "+this.getTeam_away());
        System.out.print("  Sponsers are: "+this.getSponsers());
        System.out.print("  Number of team Staff: "+this.getTeam_staff());
        System.out.print("  Number of Umpires: "+this.getUmpire());
        System.out.println("    Base Ticket Price: "+this.getOriginalTicket_price());
        System.out.println("Seat Number: "+this.getSeat_number());
        System.out.println("Payable Amount: "+this.getTicket_price());
    }
}

