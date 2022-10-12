package Modelo;

public class Autobus extends Unidad
{
    private double precioKm;
    private int kmInicio;
    private int kmFin;

    /**
     * @return the precioKm
     */
    public double getPrecioKm() {
        return precioKm;
    }

    /**
     * @param precioKm the precioKm to set
     */
    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    /**
     * @return the kmInicio
     */
    public int getKmInicio() {
        return kmInicio;
    }

    /**
     * @param kmInicio the kmInicio to set
     */
    public void setKmInicio(int kmInicio) {
        this.kmInicio = kmInicio;
    }

    /**
     * @return the kmFin
     */
    public int getKmFin() {
        return kmFin;
    }

    /**
     * @param kmFin the kmFin to set
     */
    public void setKmFin(int kmFin) {
        this.kmFin = kmFin;
    }
    
    @Override
    public double CalculaRenta() 
    {
        return (kmFin - kmInicio) * precioKm;
    }
}
