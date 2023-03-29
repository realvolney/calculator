import java.util.*;

public class App {
    private static final Scanner inputScanner = new Scanner (System.in);
    
    private static String getString(String prompt) {
          System.out.println(prompt);
          return inputScanner.nextLine();
    }
    
    private static double getDouble (String prompt) {
        System.out.println(prompt);
        double num = Double.parseDouble(inputScanner.nextLine());
        return num;
    }

    public static void simpleCalc() {
        // Boolean "x" variable to break out of while loop with "exit" input or "!Y"
        boolean x = true;
        while (x) {
            double num1 = getDouble("Pick first number");
            double num2 = getDouble("Pick second number"); 
            // Provide input options 
            System.out.println("\nadd\n"+"subtract\n"+"multiply\n"+"divide\n"+"exit\n");
            
            String options = getString("Which do you want to do?").toLowerCase() ;
            // Use switch case to check if input matches options
            switch (options) {
                // Set "x" to false (set a trap) to break out of while loop in "exit" case
                case "exit":
                    x = false;    
                    System.out.println("Goodbye");
                    break;
                case "add":
                    System.out.println(Calculator.add(num1,num2)+"\n");
                    break;
                case "subtract":
                    System.out.println(Calculator.subtract(num1,num2)+"\n");
                    break;
                case "divide":
                    if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                    }
                    else {
                        System.out.println(Calculator.divide(num1,num2)+"\n");
                        break;
                    }
                case "multiply": 
                    System.out.println(Calculator.multiply(num1,num2)+"\n");
                    break;
                default: 
                    System.out.println("Invalid input\n");
                    break;
            }
            // Here's the trap to break before we ask to continue the while loop
                if (x == false) {break;}
                
                String s = getString("Type [Y] to continue").toUpperCase();

                if (!s.equals("Y")) {
                    System.out.println("Goodbye");
                    x = false;
                }
        }
    }
        
    public static void main(String[] args) {
        simpleCalc();
    
    }
}


        
       
        

        

    
