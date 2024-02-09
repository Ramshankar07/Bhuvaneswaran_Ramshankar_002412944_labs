/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package business;

import java.util.Date;

/**
 *
 * @author Ram
 */
public class account {

    static boolean getaccnumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String routnumber;
    private String accnumber;
    private String bankname;
    private int bal;
    private Date createdon;
    public account(){
    this.createdon=new Date();
    }

    public Date getCreatedon() {
        return createdon;
    }
    public String getRoutnumber() {
        return routnumber;
    }

    public void setRoutnumber(String routnumber) {
        this.routnumber = routnumber;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getBal() {
        return bal; 
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
     @Override
    public String toString(){
        return bankname;
    }
   
}
