public class Main {

    public static void main(String[] args) {
	Person Alin = new Person(new BubbleSort());
	Person Marius= new Person(new MergeSort());
	Person Dan = new Person(new SelectionSort());

	int[] arr;
        arr = new int[]{ 12, 11, 13, 5, 6, 7 };
        Alin.sort(arr);
        Marius.sort(arr);
        Dan.sort(arr);

    }
}
