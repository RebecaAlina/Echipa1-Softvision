public class Person {

    SortingMethod sortingMethod;

    Person(SortingMethod sortingMethod){
        this.sortingMethod=sortingMethod;
    }

    public void sort(int[] arr){
     sortingMethod.sortMethod(arr);
    }

    public void setSortingMethod(SortingMethod sortingMethod){
        this.sortingMethod=sortingMethod;
    }
}
