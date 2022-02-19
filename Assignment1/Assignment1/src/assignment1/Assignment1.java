package assignment1;

/**
 *
 * @by Bobby Lo
 */
public class Assignment1 {

    public static void main(String[] args) {

        boolean winOrLose; //boolean used for wins and losses
        int total; //declare variables for total and win/loss
        int win = 0, loss = 0;
        int point = 0, roll = 1;

        
        for (int i = 1; i <= 100000; i++) { // loop for 100,000 round of craps game
            total = crapsRound(i, roll); // roll score
            if (total == 7 || total == 11) { // if first round is 7 or 11, then win
                winOrLose = true;
                win++;
            }
             else if (total == 2 || total == 3 || total == 13) {// if first round is 2,3,or 13, then lose
                winOrLose = false;
                loss++;
            } 
             else {  // if none of the above is rolled on first roll, then the total rolled saved as the point
                point = total; // initialize points
                if (i <= 10) {
                    System.out.println("Point is " + point); //displays points 
                }
                while (true) { 
                    roll++;
                    total = crapsRound(i, roll); // roll score 
                    if (total == point) { //if roll is on the point, then win
                        winOrLose = true;
                        win++;
                        break; //loop terminated
                    } 
                    else if (total == 7) { //if roll is on 7, then lose
                        winOrLose = false;
                        loss++;
                        break;
                    }
                }
            }
            
            roll = 1; 
            if (i <= 10) { //displays 10 first games 
                if (winOrLose) {
                    System.out.println("WIN!"); //display user wins
                } 
                else {
                    System.out.println("LOSS!"); // display user loses
                }
                System.out.println(win + " win(s) , " + loss + " loss(es)"); //display win and losses in same line
                System.out.println(); //create empty line seperation for visual ease
            }
        }
        System.out.println("OVERALL: "); 
        System.out.println(win + " win(s) , " + loss + " loss(es)"); //displaying overall total wins and losses
    }

    
    
    private static int crapsRound(int i, int roll) {
        
        int dice_1 = (int) (Math.random() * (6 - 1) + 1); // creates random dice rolls for dice 1 from integer 1-6
        int dice_2 = (int) (Math.random() * (6 - 1) + 1); // creates random dice rolls for dice 2 from integer 1-6

        int total = dice_1 + dice_2; //add both dice

        if (i <= 10) { // display craps details on each rounds
            System.out.println("Round " + i + " , Roll " + roll + " -- Die1: " + dice_1 + " , Die2: " + dice_2 + " --- Total: " + total);
        }
        
        return total;
    }
}
