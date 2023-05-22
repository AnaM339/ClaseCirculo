/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 * La clase círculo gestiona el comportamiento de un objeto círculo
 * @author ana-maria.manu
 */
public class Circulo {

    private double radio;
    private String color;
    private static int numCirculos;

    /**
     * Método constructor de la clase
     * @param radio del círculo
     * @param color del círculo
     */
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    
    
    /**
     * Método que calcula el area del círculo
     * @return 
     */
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
    
    /**
     * Método que calcula el perimetro del círculo
     * @return devuelve el perimetro
     * @throws Exception salta excepción si el radio es negativo o mayor de 100
     */
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }
    
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numCirculos
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /**
     * @param aNumCirculos the numCirculos to set
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }
    
}