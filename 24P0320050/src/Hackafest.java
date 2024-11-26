public class Hackafest extends seducler{

    //@author Sidhanath Verekar
    //Date :26 November 2024
    //brief: this is a hackfest class for the hackfest events, time,duration,etc. It is child class to seducler
    private int number_of_paticipants;
    private String Veneue;//location
    private String Rules;
    //Constructor
    public Hackafest(String time,String date,String event_name,String duration,String veneue,int number_of_paticipants){
       super(time,date,event_name, duration);//calling constructor of parent class
       this.Veneue=veneue;
       this.number_of_paticipants=number_of_paticipants;
    }
    //set rules
    public void setRules(String rules){
        this.Rules=rules;
    }

    //show details
    public void showHackafestDetails(){
        super.showDetails();//calling parent class method
        System.out.println("Veneue is "+Veneue);
        System.out.println("number of participants are "+this.number_of_paticipants);
        System.out.println("Rules are:\n"+this.Rules);
    }

}
