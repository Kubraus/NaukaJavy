package main.java;

public class Droid {

    int batteryLevel;
    String name;

    public String toString(){
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport(){
        System.out.println(name + "'s battery level is: " + batteryLevel);
    }


public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;


}
    public static void main(String[] args) {

    Droid Codey = new Droid("Codey");
        System.out.println(Codey.toString());
        Codey.performTask("dancing");
        Codey.performTask("singing");
        Codey.performTask("reading");
        Codey.energyReport();
    }
}
