/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivulgaTudo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Natália Santos
 */
public class Anúncio {
    private String client_name;
    private String announc_name;
    private Date datein;
    private Date dateout;
    private double investperday;

    public Anúncio(String client_name, String announc_name, Date datein, Date dateout, double investperday) {
        this.client_name = client_name;
        this.announc_name = announc_name;
        this.datein = datein;
        this.dateout = dateout;
        this.investperday = investperday;
    }

    Anúncio(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getAnnounc_name() {
        return announc_name;
    }

    public void setAnnounc_name(String announc_name) {
        this.announc_name = announc_name;
    }

    public Date getDatein() {
        return datein;
    }

    public void setDatein(Date datein) {
        this.datein = datein;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }

    public double getInvestperday() {
        return investperday;
    }

    public void setInvestperday(double investperday) {
        this.investperday = investperday;
    }
    
    public void imprimedados(){
        System.out.println(this.getClient_name());
        System.out.println(this.getAnnounc_name());
        System.out.println(this.getDatein());
        System.out.println(this.getDateout());
        System.out.println(this.getInvestperday());
        
        ArrayList<String> clientlist= new ArrayList();
        clientlist.add("Amazon");
        clientlist.add("IBM");
        clientlist.add("Dell");
        
        for(int i=0;i<clientlist.size();i++){
            
        }
        
        
        
        
        
             
    }
}
