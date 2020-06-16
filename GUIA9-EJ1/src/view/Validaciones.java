package view;

import java.util.Calendar;

public class Validaciones {

	   public static Calendar convertirAFechaCalendar(String f) {
	        Calendar fecha = Calendar.getInstance();

	        //aaaammdd
	    
	        int day = Integer.parseInt(f.substring(0,4));
	        int month = Integer.parseInt(f.substring(4,6));
	        int year = Integer.parseInt(f.substring(6,8));

	        fecha.set(Calendar.DAY_OF_MONTH, day);
	        fecha.set(Calendar.MONTH, (month - 1));
	        fecha.set(Calendar.YEAR, year);

	        return fecha;
	    }
}
