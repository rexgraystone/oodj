/*
    2. Write a Java program to move all 0's to the end of an array. 
    Maintain the relative order of the other (non-zero) array elements.
*/

class zeroes { // Class to move all the zeroes to the end of the array
    public static void main(String[] args) { 
        int[] arr = {3, 0, 4, 0, 5, 0, 0}; 
        int temp; // Temporary variable to store the value of the array element
        for(int i = 0; i < (arr.length - 1); ++i) { // Loop to move all the zeroes to the end of the array
            if(arr[i] == 0) {
                for(int j = i + 1; j < arr.length; ++j) { // Loop to swap the zeroes with the other elements
                    if(arr[j] != 0) { // Check if the element is not a zero
                        temp = arr[i]; // Swap the elements using temporary variable
                        arr[i] = arr[j]; 
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; ++i) { // Loop to print the array
            System.out.println(arr[i]);
        }
    }
} 
