public class seducler {
    //@author Sidhanath Verekar
    //Date :26 November 2024
    //brief: this is a seduler. It is parent class to hackfest and Infofest
    private String time;
    private String date;
    private String event_name;
    private String duration;
    //Constructor
    public seducler(String time,String date,String event_name,String duration){
        this.date=date;
        this.duration=duration;
        this.event_name=event_name;
        this.time=time;
    }
    //Shows Details
    public void showDetails(){
        System.out.println("Event name:"+ this.event_name+" Event Time:"+this.time+"Event Duration:"+this.duration+"Event Dates:"+this.date+"\n");
    }

}
