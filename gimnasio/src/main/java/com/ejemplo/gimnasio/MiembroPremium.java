package com.ejemplo.gimnasio;

public class MiembroPremium extends Miembro {
    private String entrenadorPersonal;

    public MiembroPremium(String nombre, int edad, String entrenadorPerosnal) {
        super(nombre, edad);
        this.entrenadorPersonal = entrenadorPerosnal;
    }

    public String getEntrenadorPersonal() {
        return entrenadorPersonal;
    }

    @Override
    public double cuotaMensual() {
        return super.cuotaMensual() + 30000.0;

    }

}
