import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        /**Calendar date = Calendar.getInstance();
        System.out.println(date.get(Calendar.DATE));
        System.out.println(date.get(Calendar.MONTH));
        System.out.println(date.get(Calendar.YEAR));
         */


        Date date1 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(dateFormat.format(date1));
    }


}
