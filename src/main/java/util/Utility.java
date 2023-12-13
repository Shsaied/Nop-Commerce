package util;
import java.util.Random;

public class Utility {
    //function to select random number depend on the maximum value sent to it
    //this function used in select date and month of birth
        public static int generateRandomInt(int max)
        {
            Random random = new Random();
            return random.nextInt(max);
        }
        //this function to select random year used to select year of birth
        public static String generateRandomYear()
        {
            int minYear = 1913;
            int maxYear = 2023;
            Random random = new Random();
            int randomYear = random.nextInt(maxYear - minYear + 1) + minYear;
            return String.valueOf(randomYear);
        }

        //this function to select random number from certain list
        // used to select category from menu
    public static int generateRandomNumberFromList(){
        int[] numbers = {11, 15, 19, 23, 24, 25};
           // int[] numbers = {6, 10, 14, 18, 19, 20};
        Random random = new Random();
        int randomIndex = random.nextInt(numbers.length);
        int randomNumber = numbers[randomIndex];
        return  randomNumber;
    }

    public static int generateRandomNumberFromComputersCategoryList(){
        int[] numbers = {12, 13, 14};
        Random random = new Random();
        int randomIndex = random.nextInt(numbers.length);
        int randomNumber = numbers[randomIndex];
        return  randomNumber;
    }


    public static int generateRandomNumberFromColorList(){
        int[] numbers = {14, 15, 16};
        Random random = new Random();
        int randomIndex = random.nextInt(numbers.length);
        int randomNumber = numbers[randomIndex];
        return  randomNumber;
    }

    }

