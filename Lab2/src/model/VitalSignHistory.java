/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Ram
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> history;
    public VitalSignHistory(){
        this.history = new ArrayList<>();
    }

    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    public VitalSign addNewVital(){
        VitalSign newVitals = new VitalSign();
        history.add(newVitals);
        return newVitals;
        
    }
    public void deleteVitals(VitalSign vs){
        history.remove(vs);
    }
    
}
