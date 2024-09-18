/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author HP
 */
public class Shelterowner {
    
 private String name;
 private String contact;
 private String password;
 private String sheltername;
 private String address;
 
 public Shelterowner(){}
 
  public Shelterowner(String name, String contact,String password,String sheltername,String address) {
        this.name= name;
        this.contact = contact;
         this.password = password;
         this.sheltername = sheltername;
         this.address = address;
   
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the sheltername
     */
    public String getSheltername() {
        return sheltername;
    }

    /**
     * @param sheltername the sheltername to set
     */
    public void setSheltername(String sheltername) {
        this.sheltername = sheltername;
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
 

}
