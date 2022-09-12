import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            arrayList.add(i, random.nextInt(2));
            linkedList.add(i, random.nextInt(2));

        }

        System.out.println("Array before:");
        System.out.println(Arrays.toString(arr));
        sort(arr);

        System.out.println("\nArraysList before:");
        System.out.println(arrayList);
        sort(arrayList);

        System.out.println("\nLinkedList before:");
        System.out.println(linkedList);
        sort(linkedList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorttolgondon kuyin:");
        System.out.println(Arrays.toString(array));
    }

    public static void sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println("ArrayList sorttolgondon kuyin: ");
        System.out.println(arrayList);
    }

    public static void sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        System.out.println("LinkedList sorttolgondon kuyin: ");
        System.out.println(linkedList);
    }
}