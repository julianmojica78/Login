/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.estesiweb.clase;

/**
 *
 * @author DAVID
 */
public class Suma {
    
    private int num1;
    private int num2;
    private int total;
    private String mensaje;

    
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Constructor para poder instanciar la clase
     * @param num1
     * @param num2
     * @param total 
     */
    public void setMensaje(String mensaje) {    
        this.mensaje = mensaje;
    }

    public Suma(int num1, int num2, int total) {
        this.num1 = num1;
        this.num2 = num2;
        this.total = total;
    }

    public Suma() {
    }
    
    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
}
