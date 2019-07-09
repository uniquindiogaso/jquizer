package uniquindio.estudiantes.bases.Utiles;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Fechas {
	/**
	 * permite hacer un casting de date a localdate
	 * 
	 * @param date que se desea cambiar de formato
	 * @return una fecha en formato local date
	 */
	public static LocalDate pasarALocalDate(Date date) {
		return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	
	/**
	 * Fecha de Calendario JavaFx a Date
	 * @param fecha
	 * @return
	 */
	
	public static Date LocalDateADate(LocalDate fecha) {
		Instant instant = Instant.from(fecha.atStartOfDay(ZoneId.systemDefault()));
		return  Date.from(instant);
	}

}
