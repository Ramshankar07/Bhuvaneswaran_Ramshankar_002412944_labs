/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Ram  
 */
public class accountdirectory {
    private ArrayList<account> accountlist;
//    private int accountdetails;

    public ArrayList<account> getAccountlist() {
        return accountlist;
    }

    public accountdirectory() {
        this.accountlist = new ArrayList<>();
    }

    public void setAccountlist(ArrayList<account> accountlist) {
        this.accountlist = accountlist;
    }
    
    public account addaccount(){
        account accountdetails = new account();
        accountlist.add(accountdetails);
        return accountdetails;
        
    }
    public void deleteaccount(account accountdetails){
        accountlist.remove(accountdetails);
    }
    public account searchaccount(String accunumber){
        for(account accountdetails: accountlist){
            if(accountdetails.getAccnumber().equals(accunumber)){
            return accountdetails;
            }
        }
        return null;
    }
    
}
