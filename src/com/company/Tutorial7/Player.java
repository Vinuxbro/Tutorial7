public class Player {
    private String Name;
    private int Age;
    private String Type;
    private Double Statics;

    public Player(String Name, int Age, String Type, Double Statics){
        this.Name=Name;
        this.Age=Age;
        this.Type=Type;
        this.Statics=Statics;


    }
    void getBatting(){
        double rate=this.Statics/15;
        System.out.println("Run rate is"+rate);

    }

    void getpalyerDetails(String playerName){
        System.out.println("player name :"+Name);
        System.out.println("player age :"+Age);
        System.out.println("player stats :"+Statics);
        System.out.println("player type :"+Type);
    }

    void getPlayerType(){
        System.out.println("Player Type: "+Type);
    }

    void getBestPreformence(){

    }










}
