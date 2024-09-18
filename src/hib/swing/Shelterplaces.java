/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author HP
 */
public class Shelterplaces {
    
    private String id;
    private String name;
    private String contact;
    private String address;
    private String perdayCharge;
   
    public Shelterplaces() {}

    public Shelterplaces(String id, String name, String contact, String address, String perdayCharge) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.perdayCharge = perdayCharge;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the perdayCharge
     */
    public String getPerdayCharge() {
        return perdayCharge;
    }

    /**
     * @param perdayCharge the perdayCharge to set
     */
    public void setPerdayCharge(String perdayCharge) {
        this.perdayCharge = perdayCharge;
    }

   
    
}
