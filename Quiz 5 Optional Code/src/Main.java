import java.util.Random;

public class Main{
    public static void main(String[] args) {


        int[] numbers = new int [10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = 500;
        numbers[5] = 123;
        numbers[6] = -67;
        numbers[7] = -400;
        numbers[8] = 6767;
        numbers[9] = 12311221;

        int result = bozoSearch(numbers, 6767);

        if (result == -1) {
            System.out.println("Value was not found");
        } else {
            System.out.println("Search was found at index " + result);
        }

    }

    private static int bozoSearch(int[] arr, int search)
    {
        Random rand = new Random();
        boolean[] tried = new boolean[arr.length];
        int triedCount = 0;
        while (triedCount < arr.length) //triedcount would be the index of the tried array
        {
            int randomIndex = rand.nextInt(arr.length);
            if(tried[randomIndex])  //if its the same index as something that was marked as tried, go again
            {
                continue;
            }

            tried[randomIndex] = true;
            triedCount++; //basically the index of the array

            if (arr[randomIndex] == search) {
                return randomIndex;
            }


        }
        return -1;  //if nothing was found
    }
}

