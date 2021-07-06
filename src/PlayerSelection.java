import java.util.Scanner;

public class PlayerSelection {
    public static void main (String args[]){
        String[] Batsmens = {"david malan","Aaron Finch","Babar Azam","Devon Conway","Virat Kohli"};
        String[] Bowlers  = {"Tabraiz Shamsi","Rashid Khan","Ashton Agar","Adil Rashid","Wanindu De Silva"};
        String[] Keppers  = {"Mohammad Nabi","Shakib Al Hasan","Glenn Maxwell","Richard Berrington","Gareth Delany"};

        //menu
        System.out.println("--            MENU            --");
        System.out.println("  Add Player                   A");
        System.out.println("  View all Players             V");
        System.out.println("  Display Best two Batsman     B");
        System.out.println("  Display two best bowlers     Z");
        System.out.println("  Display the best Keeper      K");
        System.out.println("  EXIT                         0");

        Scanner input = new Scanner(System.in);

        String players [];

        while(true){
            System.out.println("Please Enter a option : ");
            String option = input.next();
            if(option == "A"){

            }else if(option == "V"){

            }else if(option=="B"){

            }else if(option=="Z"){

            }else if(option=="K"){

            }
            if(option=="0"){break;}
        }
    }


}
