package Modelo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tractor extends Unidad 
{
    private double precioDia;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;
    
    /**
     * @return the precioDia
     */
    public double getPrecioDia() {
        return precioDia;
    }

    /**
     * @param precioDia the precioDia to set
     */
    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    /**
     * @return the fechaInicio
     */
    public GregorianCalendar getfechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setfechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
        
    }

    /**
     * @return the fechaFin
     */
    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    @Override
    public double CalculaRenta() {
        Date di = fechaInicio.getTime();
        Date df = fechaFin.getTime();
        return precioDia * getDaysDiff(di, df);
    }    
    
    public static int getDaysDiff(Date date1, Date date2)
    {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date1);

    int d1 = cal.get(Calendar.DATE);

    cal.setTime(date2);

    int d2 = cal.get(Calendar.DATE);

    return d2 - d1;
    }
}
