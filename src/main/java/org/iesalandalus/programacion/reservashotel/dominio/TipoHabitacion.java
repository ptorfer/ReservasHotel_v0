package org.iesalandalus.programacion.reservashotel.dominio;

public enum TipoHabitacion {
    SUITE ("SUITE",4),
    SIMPLE ("SIMPLE",1),
    DOBLE ("DOBLE",2),
    TRIPLE ("TRIPLE",3);


    //Atributos.

    private String descripcion;
    private int numeroMaximoPersonas;

    //Constructores.

    TipoHabitacion (String descripcion, int numeroMaximoPersonas) {
        this.descripcion = descripcion;
        this.numeroMaximoPersonas = numeroMaximoPersonas;
    }

    public int getNumeroMaximoPersonas(){
        return numeroMaximoPersonas;
    }

    @Override
    public String toString() {
        return String.format ("TipoHabitacion: %s, numeroMaximoPersonas: %s",
            this.descripcion, getNumeroMaximoPersonas());
    }
}





