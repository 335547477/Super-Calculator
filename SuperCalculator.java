package learningtoprogram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  Kinjal
 * Class:   ICS3U
 *
 * Program: Super Calculator
 * Input: (numbers, values, and characters) 
 * Processing: (doing math and ASCII art) 
 * Output: (ASCII art splash screen and super calculator screen)
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;
import java.awt.Color;
import java.text.*;

/**
 *
 * @author Kinjal
 */
public class SuperCalculator {


    public static void art(Console c) {
        //prints ASCII art to screen 
        c.setCursor(c.getMaxRows()/2-3, c.getMaxColumns()/2 - 27);
        c.setTextColor(Color.PINK);
        c.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        c.setCursor(c.getMaxRows()/2-2, c.getMaxColumns()/2 - 27);
        c.setTextColor(Color.red);
        c.println("   K   KKKK.  IIIII    Nn    N     J    AAAAAA     L   ");
        c.setTextColor (Color.orange);
        c.setCursor(c.getMaxRows()/2-1, c.getMaxColumns()/2 - 27);
        c.println("   K  kKK.      i      Nn    N     J   a      a    l   ");
        c.setTextColor (Color.yellow);
        c.setCursor(c.getMaxRows()/2, c.getMaxColumns()/2 - 27);
        c.println("   K kK.        i      N  n  N     J   a      a    l   ");
        c.setTextColor (Color.green);
        c.setCursor(c.getMaxRows()/2+1, c.getMaxColumns()/2 - 27);
        c.println("   K kK.        i      N   n N     J   a AAAA a    l   ");
        c.setTextColor (Color.blue);
        c.setCursor(c.getMaxRows()/2+2, c.getMaxColumns()/2 - 27);
        c.println("   K  kKK.      i      N    nN     J   a      a    l   ");
        c.setTextColor(Color.magenta);
        c.setCursor(c.getMaxRows()/2+3, c.getMaxColumns()/2 - 27);
        c.println("   K   KKKK.  IIIII    N    nN  JJJJ   a      a    LLLL");
        c.setCursor(c.getMaxRows()/2+4, c.getMaxColumns()/2 - 27);
        c.setTextColor (Color.pink);
        c.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~"); 
        c.println ();
        c.setCursor(c.getMaxRows()/2+8, c.getMaxColumns()/2 - 11);
    }
    public static int menu(Console c) {
        //calculator menu chart
        c.print("Menu:");
        c.setTextBackgroundColor(Color.white);
        c.setTextColor (Color.DARK_GRAY);
        c.println ("");
        //output various calculator function 
        c.println ("1.Linear Equations");
        c.println("2.Boolean Logic");
        c.println("3.Number Fun");
        c.println ("4.Word Math");
        c.println ("5.Quadratic Equations");
        c.println ("6.Statistics");
        //asks user for inputs and reads input
        c.println ("Enter the number beside the function you want to use and Press Enter");
        int optionChosen = c.readInt();
        return optionChosen;
    }
    public static void chosen1(Console c) {
            c.clear();
            c.println ("Linear Equations");
            //asks user for two ordered pair coordinates
            c.println ("Enter x coordinate for first point");
            double x1 = c.readInt();
            c.println ("Enter y coordinate for first point");
            double y1 = c.readInt ();
            c.println ("Enter x coordinate for second point");
            double x2 = c.readInt ();
            c.println ("Enter y coordinate for second point");
            double y2 = c.readInt();
            c.clear ();
            //takes returned distance from method and outputs rounded answer 
            double distance1 = distance(c,x1,y1,x2,y2);
            DecimalFormat distance1f = new DecimalFormat ("#.##");
            c.println ("Distance: The distance between the points is " + distance1f.format (distance1));
            //calculates slope of the line and outputs rounded answer 
            double slope = slope1(c,x1,y1,x2,y2);
            DecimalFormat slopef = new DecimalFormat ("#.##");
            c.println ("Slope: The slope of the given line is " + slopef.format (slope));
            //calculates the equation of the line and outputs rounded answer 
            //y-intercept 
            double lineEquationY = y1-(slope*x1);
            DecimalFormat lineEquationYf = new DecimalFormat ("#.##");
            c.println ("Equation: The equation of the line is y =" + slopef.format (slope) + "x+" + lineEquationYf.format (lineEquationY));  
            //calculates midpoint and outputs rounded answer 
            //x-coordinate
            double midpointX = ((x1+x2)/2);
            //y-coordinate
            double midpointY = ((y1+y2)/2);
            DecimalFormat midpointXf = new DecimalFormat ("#.##");
            DecimalFormat midpointYf = new DecimalFormat ("#.##");
            c.println ("Midpoint: The midpoint of the given line is (" + midpointXf.format (midpointX) + "," + midpointYf.format (midpointY) + ")");
    }
        public static double distance(Console c, double x1, double y1, double x2, double y2) {
            //calculates the distance between coordinates using math 
            c.print ("Equations for points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")"); 
            c.println ();
            c.println ();
            double distance = Math.sqrt (((y2-y1)*(y2-y1))+((x2-x1)*(x2-x1))); 
            return distance;
    }
        public static double slope1(Console c, double x1, double y1, double x2, double y2) {
          //calculates slope between points
          double slope = ((y2-y1)/(x2-x1));
          return slope;
    } 
    public static void factors(Console c) {
            c.setTextColor(Color.red);
            c.println ("Factors");
            c.setTextColor(Color.black);
            //asks user for the dididend and divisor 
            c.println ("Enter the dividend (the number you would want to divide)");
            double a = c.readDouble ();
            c.println ("Enter the divisor (the number you would want to divide by)");
            double b = c.readDouble ();
            //add nested if for whether equation is divisable using modulus 
            if (a % b == 0) {
                c.println ("Yes, " + a + " is divisable by " + b);
            }
            else  {
                c.println ("No, " + a + " is not divisable by " + b);
            }
    }
    public static void oddEven(Console c) {
            c.setTextColor (Color.red);
            c.println ("Odd or Even?");
            c.setTextColor (Color.black);
            //asks user for number 
            c.print ("Please enter a number: ");
            double number = c.readDouble ();
            //adds nested if for is number has a remainder when divided by 2
            if (number % 2== 0) {
                c.println ("The number " + number + " is even.");
            }
            else {
                c.println ("The number " + number + " is odd.");
            }
    }   
    public static void posNegative (Console c) {
         c.setTextColor (Color.red);
            c.println ("Positive or Negative?");
            c.setTextColor(Color.black);
            //asks user to enter a number
            c.print ("Please enter an integer: ");
            //determines whether postive, negative, or zero using boolean logic
            int integer = c.readInt ();
            if (integer>0) {
                c.println ("The number " + integer + " is positive.");
            }
            else if (integer<0) {
                c.println ("The number " + integer + " is negative.");
            }       
            else {
                c.println ("The number is zero.");
            }
    }  
    public static void highestNum (Console c) {
            c.setTextColor (Color.red);
            c.println ("Highest Number");
            c.setTextColor (Color.black);
            //ask user for 5 numbers
            c.print ("Enter Number 1:");
            double num1 = c.readDouble ();
            c.print ("Enter Number 2:");
            double num2 = c.readDouble ();
            c.print ("Enter Number 3:");
            double num3 = c.readDouble ();
            c.print ("Enter Number 4:");
            double num4 = c.readDouble ();
            c.print ("Enter Number 5:");
            double num5 = c.readDouble ();
            // uses number 1 and determines if its greater than the rest
            //if so, then prints num1 as highest 
            if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
                c.println ("The highest number was " + num1);
            }
            //print number 2 if its higher than the rest 
            //doesn't need to check number 1 because if it was highest the if above would be printed 
            else if (num2>num3 && num2>num4 && num2>num5) {
                c.println ("The highest number was " + num2);
            }
            //print number 2 if its higher than the rest (no need to check 1 or 2)
            else if (num3>num4 && num3>num5) {
                c.println ("The highest number was " + num3);
            }
            //print number 2 if its higher than the rest (no need to check 1,2,or 3)
            else if (num4>num5) {
                c.println ("The highest number was " + num4);
            }
            //if none of the above is true then prints number 5 is highest
            else {
                c.println ("The highest number was " + num5);           
            }
            
    }
    public static void vowel(Console c) {
         c.println ("Vowel Count");
            c.println ("Type in a 4-letter word");
            //reads string and converts to lowercose 
            String word;
            word = c.readLine ();
            word = word.toLowerCase();
            //create character of each letter in string 
            char letter1 = word.charAt(0);
            char letter2 = word.charAt (1);
            char letter3 = word.charAt (2);
            char letter4 = word.charAt (3);
            //uses if statemetns to count if/how many vowels are in the stirng 
                int vowel = 0;
                if (letter1 == 'a'|| letter1 == 'e' || letter1 == 'i' || letter1 == 'o' || letter1 == 'u') {
                    vowel++;
                }
                if (letter2 == 'a'|| letter2 == 'e' || letter2 == 'i' || letter2 == 'o' || letter2 == 'u') {
                    vowel++;
                }
                if (letter3 == 'a'|| letter3 == 'e' || letter3 == 'i' || letter3 == 'o' || letter3 == 'u') {
                    vowel++;
                }
                if (letter4 == 'a'|| letter4 == 'e' || letter4 == 'i' || letter4 == 'o' || letter4 == 'u') {
                    vowel++;
                }
                c.println ("The number of vowels in this word is: " + vowel);
    }
    public static void groupStudents (Console c) {
        c.println ("Group Students");
            //reads first name and changes all letters to uppercase
            c.println ("Enter your first name to be put into a group");
            String name = c.readLine ();
            name = name.toUpperCase();
            //uses if's to see if char is less than or more than the alloted letter ranges
            //prints which group student is in
            char firstLetter = name.charAt (0);
                if (firstLetter >= 'A' && firstLetter <= 'H' ) {
                    c.println ("Yay! You are in Group 1!");
                }
                else if (firstLetter >= 'I' && firstLetter <= 'P') {
                    c.println ("Yay! You are in Group 2");
                }
                else {
                    c.println ("Yay! You are in Group 3");
                }
    }
    public static int sumDigits (Console c){
        //asks user to enter 3-digit number and stores under number
        c.println ("Write a 3 digit number");
        int number = c.readInt();
        //the first number is the number divided by 10 twice
        int firstNum = (number / 10 )/ 10;
        //middle numbers is the remainder of the number divided by 10 after being once divded by 10 already 
        int middleNum = (number/10) % 10;
        //the last number is the remainder of the number divided by 10
        int lastNum = number % 10;
        //sums the digits and returns sum  
        int sum = firstNum + middleNum + lastNum;
        return sum;
    } 
    public static int investmentValue (Console c) {
        //asks user to enter investment amount and stores value
        c.println ("Please enter investment amount: ");
        double investment = c.readDouble();
        //asks user to enter annual interest rate and stores value
        c.println ("Please enter the annual interest rate: ");
        double annualRate = c.readDouble ();
        //to find monthly rate by dividing annual rate by 12
        double monthlyRate = annualRate / 12;
        //asks user to enter number of years investment occurs ans stores value
        c.println ("Please enter the number of years of investment: ");
        double yearNum = c.readDouble();
        //finds final value using formula futureInvestmentValue = investmentAmount x (1 + monthlyInterest)^numberOfYears * 12
        int investmentValue = (int) (investment*(Math.pow((1 + monthlyRate),(yearNum*12))));
        //returns future investment value
        return investmentValue;
    }
    public static double airportDistance (Console c) {
        //asks user to input the altitude of the plane and stores value
        c.println ("Input the altitude of the plane: ");
        double altitude = c.readDouble ();
        //asks user to input the degree the plane is angled at and stores value
        c.println ("Enter the degree the plane is angled at: ");
        double angle = c.readDouble ();
        //finds the tangent of the angle but is in radians
        //converts the tangent to degrees
        double tanDeg = Math.toDegrees (Math. tan(Math.toRadians(angle)));
        //finds distance by dividing the altitude by the tan in degrees
        double distance = altitude / tanDeg;
        //returns distance
        return distance;        
    }
    public static void averageNumbers (Console c) {
        //asks user to enter a numbers, stores in num, and creates int count
        c.println ("Enter a number");
        int num = c.readInt();
        int count = 0;
        //if first number entered is -1
        if (num==-1) {
            //prints you entered 1 numbers, total sum is -1, and average is -1
            c.println ("You entered 1 number.");
            c.println ("The total sum of the numbers is -1");
            c.println ("The average of the numbers is -1");
        }
        //loops while numbers isn't -1 (A.K.A until the number is -1)
        while (num!=-1) {
           //asks user to enter the number again and stores in num1
           c.println ("Enter a number");
           int num1 = c.readInt();
           //new number is number + the number just entered
           num = num + num1;
           //count of how many numbers their are increases by one
           count++;
           //if -1 is entered as num1 then...
           if (num1 == -1) {
             //prints how many numbers were entered which is the count value
             c.println ("You entered " + count + " numbers.");
             //sums all the numbers by adding one to disclude the -1 and prints answer
             int sum = num + 1;
             c.println ("The total sum is " + sum);
             //finds average by taking the sum and dividing by how many numbers are there (count)
             double average = (double) sum/count;
             //rounds value to two decimal places and prints average
             DecimalFormat averagef =  new DecimalFormat ("#.##");
             c.println ("The average of the numbers entered is " + averagef.format (average));
             //asks user to press any key to exit loop and breaks out when char is enterred
             c.println ("Press any key to exit \n\n");
             c.getChar();
                break;
             
           }
        }      
        //when loop is broken out of, prints thanks for using the program
        c.println ("Thanks for using the program!");

    }

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console c = new Console (); 
        //getting cursor to the middle and making ASCII art name  
        art (c);
        //press any key to continue and clear screen
        c.println("Press Any Key To Continue");
        c.getChar();
        c.clear ();
        c.setCursor(c.getMaxRows()/2-2, c.getMaxColumns()/2);
        c.setTextColor (Color.black);
        c.setTextBackgroundColor (Color.LIGHT_GRAY);
        //prints menu from method and allows user to enter function
        int functionChosen = menu(c);
        //if user picks 1 and chooses linear equations 
     
            if (functionChosen==1) {
            chosen1 (c);
        }
        //if user picks 2 and chooses boolean logic
        else if (functionChosen == 2) {
            c.clear ();
            c.println ("Boolean Logic"); 
        }
        //if user pick 3 and chooses number fun 
        else if (functionChosen == 3) {
            c.clear ();
            c.println ("Number Fun");
        //Factors
            factors (c);
        //Determine odd or even
            oddEven (c);
        //Positive or Negative
            posNegative (c);
        //Highest Number
            highestNum (c);
        //Sum of the digits in 3-digit number
          c.println ("The sum of these numbers are: " + sumDigits (c)); 
        //Future Investment Value Calculator 
          c.println ("The Future Investment Value is: " + investmentValue (c));
        //Distance to Nearest Airport
          c.println ("The distance to the nearest airport is: " + airportDistance (c));
        }
        else if (functionChosen == 4) {
            c.clear ();
            c.println ("Word Math");
        //Vowel Count 
           vowel (c);
        //Group Students
            groupStudents (c);         
        }
        else if (functionChosen == 5) {
            c.clear ();
            c.println ("Quadratic Equations");
        }
        else if (functionChosen == 6) {
            c.clear();
            c.println ("Statistics");
        //Finding Average Numbers     
            averageNumbers (c);
        }
        else {
            c.clear ();
            c.println ("Sorry, you picked an invalid number. Try Again");
         
        }
        
       
    }
    }

