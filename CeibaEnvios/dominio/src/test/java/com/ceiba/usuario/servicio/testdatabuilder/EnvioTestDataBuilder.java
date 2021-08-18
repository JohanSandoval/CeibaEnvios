package com.ceiba.usuario.servicio.testdatabuilder;

public class EnvioTestDataBuilder {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;

    private int ciudadOrigen;
    private int ciudadDestino;
    private double peso;

    private double costo;
    private String fechaEstimada;

    public EnvioTestDataBuilder() {
        nombre = "juan";
        apellido = "perez";
        telefono = "123456789";
        ciudadOrigen = 1;
        ciudadDestino = 2;
        peso = 15;
        costo = 15000;
        fechaEstimada = "30/08/2021";
    }
}
