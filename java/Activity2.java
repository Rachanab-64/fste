package Activities;

public class Activity2 {
	    public static void main(String[] args) {
	        // Initialize the array with 6 numbers
	        int[] numbers = {10, 77, 10, 54, -11, 10};

	        // Variable to hold the sum of all 10's
	        int sum = 0;

	        // Loop through the array to find and sum all 10's
	        for (int num : numbers) {
	            if (num == 10) {
	                sum += num;
	            }
	        }

	        // Check if the sum is exactly 30
	        if (sum == 30) {
	            System.out.println(true);
	        } else {
	            System.out.println(false);
	        }
	    }
	
}

/* 
    public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}
*/