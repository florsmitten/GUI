package Controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.Autos;

public class AutosControlador {

	public static Autos buscarAudiovisual(String patenteauto, ArrayList<Autos> autos) {

        Autos auto;
        Iterator<Autos> iteratorAudiovisuales = autos.iterator();
        while (iteratorAudiovisuales.hasNext()) {
        	auto = iteratorAudiovisuales.next();

            if (auto.getPatente().equals(patenteauto)) {
                return auto;
            }
        }
        return null;
    }
}
