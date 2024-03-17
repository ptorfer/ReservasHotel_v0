/**
 * @author: Patricia Torres Fernandez
 * Date: 17/03/2024
 * Time: 20:15
 */

package org.iesalandalus.programacion.reservashotel.dominio;

import java.util.Objects;

public class Habitacion {

    //Atributos

    public final static double MIN_PRECIO_HABITACION =40.0;
    public final static double MAX_PRECIO_HABITACION =150.0;
    public final static int MIN_NUMERO_PUERTA = 0;
    public final static int MAX_NUMERO_PUERTA = 14;
    public final static int MIN_NUMERO_PLANTA = 1;
    public final static int MAX_NUMERO_PLANTA = 3;
    private String identificador;
    private int planta;
    private double puerta;
    private double precio;
    private TipoHabitacion tipoHabitacion;

    //Constructores.

    public Habitacion (int planta, int puerta, double precio,
                       TipoHabitacion tipoHabitacion){
        setPlanta (planta);
        setPuerta (puerta);
        setPrecio (precio);
        setTipoHabitacion (tipoHabitacion);
        setIdentificador(String.valueOf(planta)+puerta);
    }


    public Habitacion (Habitacion habitacion) {
        if (habitacion == null){
            throw new NullPointerException("ERROR: No es posible copiar una " +
                    "habitación nula.");
        }
        setPlanta(habitacion.planta);
        setPuerta(habitacion.puerta);
        setPrecio(habitacion.precio);
        setTipoHabitacion(habitacion.tipoHabitacion);
        setIdentificador(String.valueOf(habitacion.getPlanta())+habitacion.getPuerta());
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        if (planta < MIN_NUMERO_PLANTA || planta > MAX_NUMERO_PLANTA) {
            throw new IllegalArgumentException("ERROR: No se puede establecer como planta" +
                    " de una habitaci�n un valor menor que "
                    + MIN_NUMERO_PLANTA + " ni mayor que "
                    + MAX_NUMERO_PLANTA + ".");
        } else {
            this.planta = planta;
        }
    }

    public double getPuerta() {
        return puerta;
    }

    public void setPuerta(double puerta) {
        if (puerta < MIN_NUMERO_PUERTA || puerta > MAX_NUMERO_PUERTA) {
            throw new NullPointerException("ERROR: No se puede establecer como " +
                    "puerta de una habitaci�n un valor menor que "
                    + MIN_NUMERO_PUERTA + " ni mayor que "
                    + MAX_NUMERO_PUERTA + ".");
        } else {
            this.puerta = puerta;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < MIN_PRECIO_HABITACION || precio > MAX_PRECIO_HABITACION) {
            throw new NullPointerException("ERROR: No se puede establecer como precio" +
                    " de una habitaci�n un valor menor que "
                    + MIN_PRECIO_HABITACION + " ni mayor que "
                    + MAX_PRECIO_HABITACION + ".");
        } else {
            this.precio = precio;
        }
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        if (tipoHabitacion == null) {
            throw new NullPointerException("ERROR: No se puede establecer un tipo " +
                    "de habitaci�n nula.");
        } else {
            this.tipoHabitacion = tipoHabitacion;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Habitacion habitacion)) return false;
        return identificador.equals(habitacion.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return String.format ("identificador=%s (%d-%d), precio habitaci�n=%s, " +
                "tipo habitaci�n=%s", getIdentificador(), getPlanta(),
                getPuerta(), getPrecio(), getTipoHabitacion());

    }
}
