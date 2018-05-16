public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int[] rotated = Rotacja.rotate(array, 4);

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("-----------------");
        for (int element : rotated) {
            System.out.print(element + " ");
        }
    }

}