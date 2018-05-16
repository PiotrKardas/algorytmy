import java.util.Arrays;

public class ilerazy {
    public static void main(String[] args) {
        int[] tablica =new int[] {9,64,5,10,4,9,9,1,0};


        int counter=0;


        for (int i = 0; i <=tablica.length-1 ; i++) {

            for (int j = 0; j <=tablica.length-1 ; j++) {

                if (tablica[i]==tablica[j]){
                    counter++;
                }
            }
            System.out.println("element tablicy: "+tablica[i]+", liczba powtorzen: "+counter+".");
            counter=0;

        }


    }

}

