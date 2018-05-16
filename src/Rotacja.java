public class Rotacja {


    public static int[] rotate(int[] array, int byDigits){
        int[] rotated = new int[array.length];
        int index;
        for (int i=0; i<array.length;i++){
            index = (i+byDigits)%(array.length);
            rotated[index] = array[i];
        }
        return rotated;
    }

}