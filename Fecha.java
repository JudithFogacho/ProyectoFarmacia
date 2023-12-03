import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void darFechaActual(){
        GregorianCalendar gc = new GregorianCalendar();
        dia=gc.get(Calendar.DAY_OF_MONTH);
        mes=gc.get(Calendar.MONTH)+1;
        anio=gc.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }
}
