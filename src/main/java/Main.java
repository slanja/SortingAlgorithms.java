public class Main {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 1, 10, 3};

        // BubbleSort(numbers);

        // InsertSort(numbers);

        SelectionSort(numbers);

        PrintList(numbers);
    }

    public static void PrintList(int list[]) {
        for (int i = 0; i < list.length; i++) System.out.printf("%d, ", list[i]);
    }

    public static void Swap(int input[], int pos1, int pos2) {
        int temp = input[pos1];
        input[pos1] = input[pos2];
        input[pos2] = temp;
    }

    public static void BubbleSort(int input[]) {
        // getting numbers from end of the list
        for (int i = input.length; i > 0; i--) {
            // getting numbers from start of the list
            for (int j = 0; j < i - 1; j++) {
                // checking if number in front is higher than number from end
                // if it is than swap these numbers
                if (input[j] > input[j+1]) {
                    // switching numbers
                    Swap(input, j, j+1);
                }
            }
        }
    }

    public static void InsertSort(int input[]) {
        // taking second number from input list
        for (int i = 1; i < input.length; i++) {
            // setting key to value at second number in the list
            int key = input[i];
            // setting j to value of i - 1
            int j = i - 1;

            // repeating action while value of j is higher or same as zero
            // and input value on position j is higher then key
            while (j >= 0 && input[j] > key) {
                // swapping higher number with lower number
                input[j + 1] = input[j];
                // setting j to next number to compare with
                j = j - 1;
            }
            // setting input value on position of j + 1 to key
            input[j + 1] = key;
        }
    }

    public static void SelectionSort(int input[]) {
        // getting index of current minimum number
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;

            // getting minimum element in the unsorted part of the array
            for (int j = i + 1; j < input.length; i++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            // switching numbers
            Swap(input, i, minIndex);
        }
    }
}