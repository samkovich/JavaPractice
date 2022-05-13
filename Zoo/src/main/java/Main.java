import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int infoNum;

        do{
            //display instruction for the user
            System.out.println("\nPlease enter a number to read about our zoo inhabitants or press 0 to EXIT.");

            System.out.println("1-TIGER");
            System.out.println("2-PANTHER");
            System.out.println("3-EAGLE");
            System.out.println("4-HAWK");
            System.out.println("5-SHARK");

            Scanner scan = new Scanner(System.in);
            infoNum = scan.nextInt();//accept a number from the user
            Tiger tiger = new Tiger();
            Panther panther = new Panther();
            Eagle eagle = new Eagle();
            Hawk hawk = new Hawk();
            Shark shark = new Shark();

            switch (infoNum){
                case 0:
                    System.out.println("Bye-bye!");
                    break;
                case 1:
                    tiger.Name();
                    tiger.Breath();
                    tiger.Movement();
                    break;
                case 2:
                    panther.Name();
                    panther.Breath();
                    panther.Movement();
                    break;
                case 3:
                    eagle.Name();
                    eagle.Breath();
                    eagle.Movement();
                    break;
                case 4:
                    hawk.Name();
                    hawk.Breath();
                    hawk.Movement();
                    break;
                case 5:
                    shark.Name();
                    shark.Breath();
                    shark.Movement();
                    break;
                default:
                    System.out.println("Wrong number!");
                    break;
            }


        }while(infoNum !=0);
        System.out.println("Have a nice day!");
    }
}
