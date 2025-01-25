

import java.util.Scanner;
public class Tests {

    //private data fields
    private int score;
    private double ave;
    private int count;

//public Constructor(s)
    public Tests()
    {
        this.setScore(0);
        this.ave = 0.0;
        this.count = 0;
    }

//public set or mutator method for every private data field (except when the data field is read-only)
    public void setScore(int newScore){
        this.score = newScore;
    }
//public get or accessor method for every private data field (except if it is a secret)
    public int getScore(){
        return this.score;
    }

    public double getAve(){
        return this.ave;
    }

    public int getCount(){
        return this.count;
    }

//public toString method that prints out all of the object state (meaning the data in the object instance that you will later instantiate in the main() method)
public String toString(){
        String output = "The average of the " + this.count + " scores entered is ";
        output += String.format("%.2f",this.getAve());
        output += ".";
        return output;
}
//custom method getAverage returns the average
public void getAverage(){
        //local variable sum
    double sum = 0.0;
        //user input
    Scanner scan = new Scanner(System.in);
    //this primes the loop
    //prompt user for first score
    System.out.println("ENTER test scores, -1 to quit");
    //take user input for first score
    this.setScore(scan.nextInt());
    //check loop condition - was score entered -1 so we can quit?
    while(this.getScore() != -1) {
        //accumulate sum
        sum += this.getScore();
        //increment score counter
       this.count++;
        //get another score from the user
        System.out.println("ENTER test scores, -1 to quit");
        this.setScore(scan.nextInt());
    }
    //loop eneded, close your Scanner object
    scan.close();
    //calculate average
    this.ave = sum/this.getCount();

}

}
