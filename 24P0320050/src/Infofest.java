public class Infofest extends seducler{
    //@author Sidhanath Verekar
    //Date :26 November 2024
    //brief: this is a Infofest class for the infofest events, time,duration,etc. It is child class to seducler
    private String location;
    private String rules;
    //Constructor
    public Infofest(String time,String date,String event_name,String duration,String location,String rules){

       super(time,date,event_name, duration);//calling parent constructor
       this.location=location;
       this.rules=rules;
    }
     public void setRules(String rules){
        this.rules=rules;
    }
    public void showInfofestDetails(){
        super.showDetails();//calling parent method
        System.out.println("Rules are:\n"+this.rules);
    }

    
}
