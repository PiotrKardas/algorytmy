public class Sum {
    public static int suma (int[] tablica){
        int suma=0;
        for (int i=0; i<=tablica.length-1; i++){
            suma=suma+tablica[i];
        }
        return suma;
    }
}
