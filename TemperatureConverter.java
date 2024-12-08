import java.util.Scanner; //1. The program imports the Scanner class for reading user input.
public class TemperatureConverter {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int choice = 0;

     //Prompt user for conversion choice.
        System.out.println("Temperature Converter");
        System.out.print("Choose an option: ");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");

     //Validate user inout for choice
     /*Input validation:it validates the user's choice using a loop that continues until a (1 or 2) is received.
       It handles invalid inputs gracefully by catching NumberFormatException  */
     while(true){
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1 || choice == 2) {
                break; //Valid Choice
            } else {
                System.out.println("Please enter 1 or 2 to select a conversion option.");
            }
        }
        catch (NumberFormatException e){
        System.out.println("Invalid input.Please enter a number(1 or 2).");
        }
     }

     //Prompt user for temperature values.
        double temperature = 0.0;
        System.out.println("Please enter a temperature value: ");

      //Validate user input for temperature
      while(true){
          try{
         temperature = Double.parseDouble(scanner.nextLine());
         break; // valid temperature.
          } catch (NumberFormatException e){
          System.out.println("Invalid input.Please enter a  valid temperature value.");
          }
      }
      //Perform conversion based on user's choice
        if (choice == 1) {
            //convert Celsius to Fahrenheit

         double fahrenheit = (temperature * 9/5) + 32;
         System.out.println("The temperature in celsius is "+temperature+ fahrenheit);
        }
        else

        {
        //Convert  Fahrenheit to Celsius.
        double celsius = (temperature - 32) * 5 / 9;
        System.out.println("The temperature in fahrenheit is " + celsius);
       }

      //Close the scanner
        scanner.close();
    }
}
