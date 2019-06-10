import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        int size, exit, addingPosition, valueNewIndex;
        int[] array, valueA;


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        }
        while (size > 20 || size < 3);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        System.out.print("{ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("}");
        do {
            System.out.println("\nPosition want to add new Index: ");
            addingPosition = scanner.nextInt();
            if (addingPosition < 0 || addingPosition > array.length)
                System.out.println("Cannot add new Index: ");
        } while (addingPosition < 0 || addingPosition > array.length);

        System.out.println("Value of new Index: ");
        valueNewIndex = scanner.nextInt();

        valueA = new int[array.length];
        for (int j = 0; j < addingPosition; j++)
            valueA[j] = array[j];
        for (int k = array.length - 1; k > addingPosition; k--)
            valueA[k] = array[k - 1];
        valueA[addingPosition]=valueNewIndex;
        System.out.println("New Array is: ");
        System.out.print("{ ");
        for (int m : valueA)
            System.out.print(m+" ");
        System.out.println("}");
    }

}