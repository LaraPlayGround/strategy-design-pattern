public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {9, 5, 1, 3, 7, 2, 8, 4, 6};

        // Create sorting strategies
        SortingStrategy bubbleSort = new BubbleSort();
        SortingStrategy mergeSort = new MergeSort();

        // Create sorting context
        SortContext sortContext = new SortContext();

        // Sort using bubble sort
        sortContext.setSortingStrategy(bubbleSort);
        sortContext.sortArray(unsortedArray);

        // Sort using merge sort
        sortContext.setSortingStrategy(mergeSort);
        sortContext.sortArray(unsortedArray);
    }
}
