package helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationUtils {
    public static int readInteger(String message , Scanner scanner ){
        while(true){
            try{
                System.out.print(message);
                return  scanner.nextInt();
            }catch (InputMismatchException ex ){
                System.out.println("ERROR!! Accept Integer Only!!! ");
                scanner.nextLine(); // clearing buffers
            }

        }

    }
}
