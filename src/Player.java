public class Player {
    private String Name;
    private int Age;
    private String Type;
    private int Statics;

    public Player(String Name,int Age, String Type, int Statics){
        this.Name=Name;
        this.Age=Age;
        this.Type=Type;
        this.Statics=Statics;


    }
    void getBatting(){
        double rate=this.Statics/15;
        System.out.println("Run rate is"+rate);

    }

    void getPlayerDetails(){
        System.out.println("Player Name   : "+Name);
        System.out.println("Player Age    : "+Age);
        System.out.println("Player Type   : "+Type);
        System.out.println("Player Statics: "+Statics);
    }

    void getPlayerType(){
        System.out.println("Player Type: "+Type);
    }

    void getBestPreformence(){

    }










}
