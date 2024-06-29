public class MYQUIIZ2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] commonElements = findCommonElements(arr1, arr2);

        for (int num : commonElements) {
            System.out.print(num + " ");
        }

    }
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int resultIndex = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result[resultIndex++] = arr1[i];
                    // Skip to the next element in arr2 to avoid duplicates
                    j++;
                }
            }
        }


        return resizeArray(result, resultIndex);
    }

    private static int[] resizeArray(int[] arr, int newSize) {
        int[] resizedArr = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            resizedArr[i] = arr[i];
        }
        return resizedArr;
    }
}
