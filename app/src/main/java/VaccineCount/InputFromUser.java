package VaccineCount;

import VaccineCount.Utils.Constants;
import java.util.Scanner;

/**
 *
 * @author Porosh Mondal
 */
public class InputFromUser {
    
    Scanner scanner;
    
    public InputFromUser(){
        scanner = new Scanner(System.in);
    }
    
    public int inputNumberOfCandidates(){
        return takeInput(Constants.NUMBER_OF_CANDIDATES);
    }
    
    public int inputNumberOfVaccine(){
        return takeInput(Constants.NUMBER_OF_VACCINES);
    }
    
    public int inputVaccineLimit(){
        return takeInput(Constants.VACCINE_LIMIT_TO_AGE);
    }
    
    public int takeInput(String inputTitle){
        System.out.print(inputTitle);
        return scanner.nextInt();
    }
    
}
