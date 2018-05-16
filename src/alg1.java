import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class alg1 {
    public static void main(String[] args) {
        TreeSet<Integer> numery = new TreeSet<>();
        System.out.println("wylosowane");
           do {
               Random random = new Random();
               int n = random.nextInt(49) + 1;
               numery.add(n);
           }
            while (numery.size()!=6);
        System.out.println(numery.size());
        System.out.println(numery);
    }
}



