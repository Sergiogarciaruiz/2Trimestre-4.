/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2trimestre.pkg4;

/**
 *
 * @author sergi
 */
public class Fracción {

    private double Numerador;
    private double Denominador;
    private double fr = Numerador / Denominador;
    private double num;

    public Fracción() {
    }

    public Fracción(double Numerador, double Denominador, double num) {
        this.Numerador = Numerador;
        this.Denominador = Denominador;
        this.num = num;
    }

    public double getNumerador() {
        return Numerador;
    }

    public void setNumerador(double Numerador) {
        this.Numerador = Numerador;
    }

    public double getDenominador() {
        return Denominador;
    }

    public void setDenominador(double Denominador) {
        this.Denominador = Denominador;
    }

    public double getFr() {
        return fr;
    }

    public void setFr(double fr) {
        this.fr = fr;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Fracci\u00f3n{" + "Numerador=" + Numerador + ", Denominador=" + Denominador + '}';
    }

    public double inversion() {
        double aux = 0;
        aux = Numerador;
        Numerador = Denominador;
        Denominador = aux;
        return 0;
    }

    public double multiplicacion() {
        double multi;
        multi = fr * num;
        return multi;
    }

    public double division() {
        double div;
        div = fr / num;
        return div;
    }
}
