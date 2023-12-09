package PracticalExam2;

public class Flight {
    private int number;
    private String destination;
    public Flight(){
        this.number = 0;
        this.destination = "";
    }
    public Flight(int number, String destination){
        if(number > 0){
            this.number = number;
            this.destination = destination;
        }else{
            this.number = 0;
            this.destination = "";
        }

    }
    public void display(){
        System.out.println("Số chuyến bay: " + number);
        System.out.println("Nơi đến: " + destination);
    }
    public String getDestination(){
        return destination;
    }
    public int getNumber(){
        return number;
    }

}
