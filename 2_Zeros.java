/*
    2. Write a Java program to move all 0's to the end of an array. 
    Maintain the relative order of the other (non-zero) array elements.
*/

class Zeroes {
    public static void main(String[] args) {
        int[] arr = {3, 0, 4, 0, 5, 0, 0};
        int temp;
        for(int i = 0; i < arr.length - 1; ++i) {
            if(arr[i] == 0) {
                for(int j = i + 1; j < arr.length; ++j) {
                    if(arr[j] != 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
} 
