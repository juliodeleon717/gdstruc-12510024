//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    public static void main(String[] args){
        System.out.println("sigma skibidi");

        //bubble sort
        int[] numbers = new int [10];
        int[] otherNumbers = new int [10];
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

        otherNumbers[0] = 1928918;
        otherNumbers[1]= 676767;
        otherNumbers[2] = 12;
        otherNumbers[3] = -4;
        otherNumbers[4] = -34;
        otherNumbers[5] = 56;
        otherNumbers[6] = -8327480;
        otherNumbers[7] = 4;
        otherNumbers[8] = 67;
        otherNumbers[9] = 2;

        System.out.println("\nUnsorted:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\nDescending Bubble Sort:");
        printArrayElements(numbers);

        System.out.println("\nUnsorted:");
        printArrayElements(otherNumbers);

        selectionSort(otherNumbers);

        System.out.println("\nReverse Selection Sort:");
        printArrayElements(otherNumbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }




            }
        }
    }
    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
              if(arr[i] < arr[smallestIndex])
              {
                  smallestIndex = i;
              }

              int temp = arr[lastSortedIndex];
              arr[lastSortedIndex] = arr[smallestIndex];
              arr[smallestIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.println(j + "");
        }
    }
}
