import java.util.Scanner;
public class Ministers01 {
    
    private static String primeMinister,president;
    private String homeMinister,chiefMinister,transportMinister,educationMinister,foreignMinister,financeMinister;
    private int countState = 0;
    private State state[];
    int indexStateRet = 0;
    int indexState = 0;

    Ministers01()
    {
        this.homeMinister = "Amit Shah";
        this.chiefMinister = "Eknath Shinde";
        this.transportMinister = "Nitin Gadkati";
        this.educationMinister = "Rajnath Sign";
        this.foreignMinister = "Jaishankar";
        this.financeMinister = "Nirmala";
    }

    public static void setPresident(String president) {Ministers01.president=president;}
    public static void setPrimeMinister(String primeMinister) {Ministers01.primeMinister=primeMinister;}
    public void setState(State state){this.state[indexState++] = state;}

    public void setCountState(int countState) 
    {
        this.countState = countState;
        state = new State[countState];
    }
    
    public int getCountState() {return countState;}
    public State getState(){return state[indexStateRet++];}

    public void displayMinisters()
    {   System.out.println();
        System.out.println("President of India is "+Ministers01.president);
        System.out.println("Prime Minister of India is "+Ministers01.primeMinister);
        System.out.println();
        for(int i=0;i<getCountState();i++)
        {
            state[i].display();
            state[i].getWinnerState();
        }
        System.out.println();
    }

}
 class State
{   
    private String name;
    private String parties[];
    int indexParties = 0;
    int indexPartiesRet = 0;
    private String mla[];
    int indexMla = 0;
    int indexMlaRet = 0;
    private int votes[];
    int indexVotes = 0;
    int indexVotesRet = 0;
    private int no_of_parties = 0;

    Ministers01 m1 = new Ministers01();

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setNo_parties(int no_of_parties)
    {
        this.no_of_parties=no_of_parties;
        parties = new String[no_of_parties];
        mla = new String[no_of_parties];
        votes = new int[no_of_parties];
    }

    public void setParties(String party){this.parties[indexParties++] = party;}
    public void setMla(String mla){this.mla[indexMla++] = mla;}
    public void setVotes(int votes){this.votes[indexVotes++] = votes;}

    public String getParties(){return parties[indexPartiesRet++];}
    public String getMla(){return mla[indexMlaRet++];}
    public int getVotes(){return votes[indexVotesRet++];}
    public int getNo_parties(){return no_of_parties;}

    public void getWinnerState()
    {
        int max  = 0 ;
        int num = 0;
        for(int i=0;i<getNo_parties();i++)
        {
            if(max < this.votes[i])
            {
                max = this.votes[i];
                num = i;
            }
        }
        System.out.println("++++++++++++++++ Winner is "+this.parties[num]+" "+this.mla[num]+" "+this.votes[num]+"++++++++++++++");
    }

    public void display()
    {   
        int indexVotesRet = 0;
        System.out.println("Name of the state is "+this.getName());
        for(int i=0;i<getNo_parties();i++)
        {
            System.out.print("      Name of the party is "+this.getParties());
            System.out.print("      Mla of the party is "+this.getMla());
            System.out.println("    Votes of the party is "+this.getVotes());
        }
    }

}
class App
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prime minister ");
        Ministers01.setPrimeMinister(sc.nextLine());
        System.out.print("Enter President ");
        Ministers01.setPresident(sc.nextLine());
        Ministers01 s1 = new Ministers01();
        System.out.print("Enter number of states in this country ");
            s1.setCountState(sc.nextInt());
            State s[] = new State[s1.getCountState()];
            for(int i=0;i<s1.getCountState();i++)
            {   
                s[i] = new State();
                System.out.print("Enter state name ");
                sc.nextLine();
                s[i].setName(sc.nextLine());
                System.out.print("How many parties in "+s[i].getName()+" "); 
                s[i].setNo_parties(sc.nextInt());
                for(int j=0;j<s[i].getNo_parties();j++)
                {
                    System.out.print("Enter Party Name ");
                    sc.nextLine();
                    s[i].setParties(sc.nextLine());
                    System.out.print("Enter Mla Name ");
                    s[i].setMla(sc.nextLine());
                    System.out.print("Enter No. of Votes ");
                    s[i].setVotes(sc.nextInt());
                }
                s1.setState(s[i]);
            }
            s1.displayMinisters();
        }
        
   }
