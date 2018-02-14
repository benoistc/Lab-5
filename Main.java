import java.util.*;
import java.lang.Math;
public class Main {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String hexNum = scan.next();
        int counter = 0;
        int length = 0;
        length = hexNum.length();
        long decimalValue = 0;
        while (counter < length)
        {
            char currentChar;
            currentChar = hexNum.charAt(counter);
            switch (currentChar)
            //switch statement for all possible hexadecimal symbols. Default case covers 0 and non-hex symbols.
            {
                case '1':
                    decimalValue += (Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '2':
                    decimalValue += (2 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '3':
                    decimalValue += (3 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '4':
                    decimalValue += (4 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '5':
                    decimalValue += (5 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '6':
                    decimalValue += (6 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '7':
                    decimalValue += (7 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '8':
                    decimalValue += (8 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case '9':
                    decimalValue += (9 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'a':
                    decimalValue += (10 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'b':
                    decimalValue += (11 * Math.pow(16, (length - 1 -counter)));
                    counter += 1;
                    break;
                case 'c':
                    decimalValue += (12 * Math.pow(16, (length - 1 -counter)));
                    counter += 1;
                    break;
                case 'd':
                    decimalValue += (13 * Math.pow(16, (length - 1 -counter)));
                    counter += 1;
                    break;
                case 'e':
                    decimalValue += (14 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'f':
                    decimalValue += (15 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'A':
                    decimalValue += (10 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'B':
                    decimalValue += (11 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'C':
                    decimalValue += (12 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'D':
                    decimalValue += (13 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'E':
                    decimalValue += (14 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                case 'F':
                    decimalValue += (15 * Math.pow(16, (length - 1 - counter)));
                    counter += 1;
                    break;
                default:
                    counter += 1;
                    break;
            }
        }
        System.out.print ("Your number is " +  decimalValue + " in decimal");
    }

}
