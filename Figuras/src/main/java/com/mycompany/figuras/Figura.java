package com.mycompany.figuras;

import java.awt.Color;

public abstract class Figura {

    private Punto centro;
    private Color color;

    public Figura(double x, double y, Color color) {
        this.centro = new Punto(x, y);
        this.color = color;
    }

    public double getXCentro() {
        return centro.getX();
    }

    public double getYCentro() {
        return centro.getY();
    }

    public Color getColor() {
        return color;
    }

    public void setXCentro(double x) {
        centro.setX(x);
    }

    public void setYCentro(double y) {
        centro.setY(y);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Métodos abstractos corregidos (sin tildes para evitar errores de compilación)
    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public int esMayorQue(Figura otraFigura) {
        int codigo;
        if (this.calcularArea() > otraFigura.calcularArea()) {
            codigo = 1;
        } else if (this.calcularArea() < otraFigura.calcularArea()) {
            codigo = -1;
        } else {
            codigo = 0;
        }
        return codigo;
    }
}
