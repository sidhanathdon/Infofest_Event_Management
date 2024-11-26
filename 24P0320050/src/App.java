import java.util.*;
//@author Sidhanath Verekar
//Brief This is the main file that runs the code. This include creation of object using Dynamic binding and Exception Handling
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        seducler scheduler;//Object of seducler
        int choice=0;
        do{
            //menu driven
            System.out.println("Enter choice 1:Infofest,2:Hackfest,0:Exit-");
            choice=sc.nextInt();
            if(choice==1){
                //Exception Handling for mismatch value
                try {
                    System.out.println("Enter name:-");
                    String name=sc.next();
                    System.out.println("Enter date:-");
                    String date=sc.next();
                    System.out.println("Enter time:-");
                    String time=sc.next();
                    System.out.println("Enter duration :-");
                    String duration=sc.next();
                    System.out.println("Enter Location:-");
                    String location=sc.nextLine();
                    System.out.println("Enter rules:-");
                    String rules=sc.nextLine();
                    scheduler=new Infofest(time, date, name, duration, location, rules);//Infofest object instaisation
                    scheduler.showDetails();//Infofest details
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Invalid value due to mismatch, try again");
                    choice=1;//Make the choice 1 so that user can re enter data

                }
            }
            else if(choice==2){
                //Exception Handling for mismatch value
                try {
                    System.out.println("Enter name:-");
                String name=sc.next();
                System.out.println("Enter date:-");
                String date=sc.next();
                System.out.println("Enter time:-");
                String time=sc.next();
                System.out.println("Enter duration :-");
                String duration=sc.next();
                System.out.println("Enter rules:-");
                String rules=sc.nextLine();
                System.out.println("Enter number of participants-");
                int number_of_paticipants=sc.nextInt();
                scheduler=new Hackafest(time, date, name, duration, rules, number_of_paticipants);//hackfest object instaisation
                scheduler.showDetails();
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Invalid value due to mismatch, try again");
                    choice=2;//made 2 so that the user re enter the values
                }
            }
            else if(choice==0)
                continue;
            else
                System.out.println("Invalid input try again\n");//To handle inputs other than specified

        }while(choice!=0);
        System.out.println("\nExited Succesfully");
        sc.close();
    }

}
