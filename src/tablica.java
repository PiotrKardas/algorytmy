public class tablica {
    public static void main(String[] args) {
        int [] tablica = {10,2,3,9,18};
        int [] tablica_tmp={};

        for (int i=0; i<=4; i++ ){
            tablica_tmp[i+1]=tablica[i];
        }


        for (int i=0; i<=4; i++ ){
            System.out.println(tablica_tmp[i]);
        }
    }
}
