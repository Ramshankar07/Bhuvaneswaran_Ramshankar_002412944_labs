/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Ram
 */
public class VitalSign {

    /**
     * @param args the command line arguments
     */
    private double temp;
    private double bp;
    private int pulse;
    private String Date;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    @Override
    public String toString(){
        return Date;
    }
  
   
    
}
