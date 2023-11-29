import java.util.NoSuchElementException;

public class BinarySearch {

    private int[] input;

    public BinarySearch(int[] input) {
        this.input = input;
    }

    public int search(int num) throws ElementNotFoundException {
        int lowerBound = 0;
        int upperBound = this.input.length - 1;
        int middleBound = this.input.length / 2;
        while (lowerBound <= upperBound) {
            if (this.input[middleBound] == num)
                return middleBound;
            else if (num < input[middleBound])
                upperBound = middleBound - 1 ;
            else
                lowerBound = middleBound + 1;
            middleBound = (upperBound + lowerBound) / 2;
        }
        throw new ElementNotFoundException();
    }


    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        BinarySearch binarySearch = new BinarySearch(input1);
        try {
            System.out.print(binarySearch.search(17));
        } catch (ElementNotFoundException e) {
            System.out.println("Element Not Found!");
        }
    }
}
