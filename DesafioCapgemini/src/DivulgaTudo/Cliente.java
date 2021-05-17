/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivulgaTudo;

import java.util.ArrayList;

/**
 *
 * @author Natália Santos
 */
public class Cliente {
    private String client_name;
    ArrayList<Anúncio>announclist;

    public Cliente () {
        announclist = new ArrayList ();
    }
            
    public Cliente (String client_name) {
        this.client_name = client_name;
        announclist = new ArrayList();
    }
    
    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public ArrayList<Anúncio> getAnnounclist() {
        return announclist;
    }

    public void setAnnounclist(ArrayList<Anúncio> announclist) {
        this.announclist = announclist;
    }
    
    public void addannounc (Anúncio A){
        
        announclist.add(A);
    }
   
    
}
