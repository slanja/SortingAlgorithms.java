public class Main {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 1, 10, 3};

        BubbleSort(numbers);

        PrintList(numbers);
    }

    public static void PrintList(int list[]) {
        for (int i = 0; i < list.length; i++) System.out.printf("%d, ", list[i]);
    }

    public static void BubbleSort(int input[]) {
        // getting numbers from end of the list
        for (int i = input.length; i > 0; i--) {
            // getting numbers from start of the list
            for (int j = 0; j < i - 1; j++) {
                /* checking if number in front is higher than number from end
                   if it is than swap these numbers
                */
                if (input[j] > input[j+1]) {
                    // switching numbers
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    }

    public static void InsertSort(int input[]) {

    }
}