
package hib.swing;

import java.io.File;


public class Animalprofile {
    
      private String contact;
    private String petName;
     private String breed;
      private String gender;
    private String age;
  private String diseasesAllergy;
    private String vaccination;
    private String temperament;
    private String food;
    private String height;
    private String weight;
    private File photo;

    public  Animalprofile() {
    }
    
    public Animalprofile(String contact, String petName, String breed, String gender, String age, String diseasesAllergy, String vaccination, String temperament, String food, String height, String weight, File photo) {
        this.contact = contact;
        this.petName = petName;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.diseasesAllergy = diseasesAllergy;
        this.vaccination = vaccination;
        this.temperament = temperament;
        this.food = food;
        this.height = height;
        this.weight = weight;
        this.photo = photo;
    }

    /**
     * @return the id
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the id to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the petName
     */
    public String getPetName() {
        return petName;
    }

    /**
     * @param petName the petName to set
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the diseasesAllergy
     */
    public String getDiseasesAllergy() {
        return diseasesAllergy;
    }

    /**
     * @param diseasesAllergy the diseasesAllergy to set
     */
    public void setDiseasesAllergy(String diseasesAllergy) {
        this.diseasesAllergy = diseasesAllergy;
    }

    /**
     * @return the vaccination
     */
    public String getVaccination() {
        return vaccination;
    }

    /**
     * @param vaccination the vaccination to set
     */
    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    /**
     * @return the temperament
     */
    public String getTemperament() {
        return temperament;
    }

    /**
     * @param temperament the temperament to set
     */
    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the photo
     */
    public File getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(File photo) {
        this.photo = photo;
    }

 
}
