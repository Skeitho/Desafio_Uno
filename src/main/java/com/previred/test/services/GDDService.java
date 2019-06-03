package com.previred.test.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.previred.test.dto.GDDDTO;
import com.previred.test.dto.GDDFaltantesDTO;

public class GDDService {

	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public GDDFaltantesDTO addDate(GDDDTO gddDTO) {
		
		GDDFaltantesDTO gddFaltantesDTO = new GDDFaltantesDTO(gddDTO);
		List<Date> fechasFaltantes = gddFaltantesDTO.getFechasFaltantes();

	    int difMes = 0;
	    Calendar calActual;
		
		for (int x=0; x < gddDTO.getFechas().size()-1; x++) {
						
			difMes = differenceInMonths(gddDTO.getFechas().get(x),gddDTO.getFechas().get(x+1));
			
			calActual = new GregorianCalendar();
	        calActual.setTime(gddDTO.getFechas().get(x));
			
		    for (int y=1; y<difMes; y++) {
		    	
		    	calActual.add(Calendar.MONTH, 1);
		    	fechasFaltantes.add(calActual.getTime());
		    	
		    }

		}
		
		gddFaltantesDTO.setFechasFaltantes(fechasFaltantes);

		return gddFaltantesDTO;
	}
	
	
	 public static Integer differenceInMonths(Date beginningDate, Date endingDate) {
	        if (beginningDate == null || endingDate == null) {
	            return 0;
	        }
	        Calendar cal1 = new GregorianCalendar();
	        cal1.setTime(beginningDate);
	        Calendar cal2 = new GregorianCalendar();
	        cal2.setTime(endingDate);
	        return differenceInMonths(cal1, cal2);
    }

    private static Integer differenceInMonths(Calendar beginningDate, Calendar endingDate) {
        if (beginningDate == null || endingDate == null) {
            return 0;
        }
        int m1 = beginningDate.get(Calendar.YEAR) * 12 + beginningDate.get(Calendar.MONTH);
        int m2 = endingDate.get(Calendar.YEAR) * 12 + endingDate.get(Calendar.MONTH);
        return m2 - m1;
    }
}
