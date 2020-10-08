import java.util.Scanner; 
/**
 *This program will tell the user the average of the heights they entered
 * @author Sevde 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in); 
    // ask the user for heights 
    System.out.println("How many heights would you like to enter?");
    int HEIGHTS_NUM = input.nextInt(); 
    // create an array with the number of spots the user entered
    int[] heights = new int[HEIGHTS_NUM];
    // ask the user for the heights 
    System.out.println("Please enter the heights on seperate lines");

    for( int i = 0; i < HEIGHTS_NUM; i++){
      heights[i] = input.nextInt(); 

    } 
    // create a variable to store the sum 
    int sum = 0; 
    // use a for loop to go through array 
    for (int i = 0; i < HEIGHTS_NUM; i++){
      // add the heights to the sum 
      sum = sum + heights[i];

    }
    // determine the average 
    int average = sum / HEIGHTS_NUM;
    //tell the user the average 
    System.out.println ("The average height is " + average + " cm");
    // determine which height is above average 
    // tell the user which heights are above average
    System.out.println("The heights above average are");
    // make a for loop to it to go through
    for ( int i = 0; i < HEIGHTS_NUM; i++){
      // make an if statement to determine which heights are above average
      if ( heights[i] > average){
    // tell the user the heights above average 
    System.out.println(heights[i]);
      }
    }
  }
}
