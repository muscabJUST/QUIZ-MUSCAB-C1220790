//muscab shucayb maxamed
//C1220790

public class quiiz {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 1, 5};
        int[] uniqueArray = removeDuplicates(inputArray);

        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }

    }
    public static int[] removeDuplicates(int[] arr) {

        sortArray(arr);


        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }


        int[] result = new int[uniqueCount];
        int resultIndex = 0;
        result[resultIndex++] = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[resultIndex++] = arr[i];
            }
        }

        return result;
    }

    private static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}