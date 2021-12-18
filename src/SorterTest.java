import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;

public class SorterTest {

    public void arrayTest(SortType sortType, int[] array){
        int[] correctArray = Arrays.copyOf(array, array.length);
        Arrays.sort(correctArray);

        switch(sortType){
            case INSERTION:
                Sorter.insertionSort(array);
                break;
            case SELECTION:
                Sorter.selectionSort(array);
                break;
        }

        assert Arrays.equals(array, correctArray);
    }

    @Test
    public void insertionSortTest() {
        runSort(SortType.INSERTION);
    }
    @Test
    public void selectionSortTest() {
        runSort(SortType.SELECTION);
    }

    private void runSort(SortType sortType){
        int[] array = {12, 13, 1, 2, 6};
        arrayTest(sortType, array);
    }
    @Test
    public void insertionSortTestNegative() {
        runSortNegative(SortType.INSERTION);
    }
    @Test
    public void selectionSortTestNegative() {
        runSortNegative(SortType.SELECTION);
    }
    private void runSortNegative(SortType sortType){
        int[] array = {-1, -4, 1, 3, 18, 10, -13};
        arrayTest(sortType, array);
    }
    @Test
    public void insertionSortTestBig() {
        runSortBig(SortType.INSERTION);
    }
    @Test
    public void selectionSortTestBig() {
        runSortBig(SortType.SELECTION);
    }
    private void runSortBig(SortType sortType){
        int[] array = {100, 200, 1543, 123, 128};
        arrayTest(sortType, array);
    }
    @Test
    public void insertionSortTestLong() {
        runSortLong(SortType.INSERTION);
    }
    @Test
    public void selectionSortTestLong() {
        runSortLong(SortType.SELECTION);
    }
    private void runSortLong(SortType sortType){
        int[] array = {1, 4, 1, 3, 3, 7, 1, 2, 4, 3, 6, 7, 4};
        arrayTest(sortType, array);
    }
    @Test
    public void insertionSortTestSame() {
        runSortSame(SortType.INSERTION);
    }
    @Test
    public void selectionSortTestSame() {
        runSortSame(SortType.SELECTION);
    }
    private void runSortSame(SortType sortType){
        int[] array = {0, 0, 0, 0, 0};
        arrayTest(sortType, array);
    }
    @Test
    public void insertionSortTest6() {
        runSort6(SortType.INSERTION);
    }
    @Test
    public void selectionSortTest6() {
        runSort6(SortType.SELECTION);
    }
    private void runSort6(SortType sortType){
        int[] array = {-134, 0, 0, 304, -234, 23, 1232, 3, 5};
        arrayTest(sortType, array);
    }
//    private void runSort(Function<> sorter){
//        int[] array = {12, 13, 1, 2, 6};
//        int[] correctArray = Arrays.copyOf(array, array.length);
//        Arrays.sort(correctArray);
//
//        sorter.apply(array);
//
//        assert Arrays.equals(array, correctArray);
//    }
    enum SortType {
        SELECTION,
        INSERTION
    }
}
