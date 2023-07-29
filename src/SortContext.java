public class SortContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortArray(int[] array) {
        if (sortingStrategy == null) {
            throw new IllegalStateException("Sorting strategy not set. Please set the sorting strategy before sorting the array.");
        }
        sortingStrategy.sort(array);
    }
}
