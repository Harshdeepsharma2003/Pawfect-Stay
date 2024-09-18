
package hib.swing;

public class Generatefair {
    
    private int days;
    private int chargeperday;
    private int totalcost;
    
    public Generatefair(){}

    public Generatefair(int days, int chargeperday, int totalcost) {
        this.days = days;
        this.chargeperday = chargeperday;
        this.totalcost = totalcost;
    }

    /**
     * @return the days
     */
    public int getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * @return the chargeperday
     */
    public int getChargeperday() {
        return chargeperday;
    }

    /**
     * @param chargeperday the chargeperday to set
     */
    public void setChargeperday(int chargeperday) {
        this.chargeperday = chargeperday;
    }

    /**
     * @return the totalcost
     */
    public int getTotalcost() {
        return totalcost;
    }

    /**
     * @param totalcost the totalcost to set
     */
    public void setTotalcost(int totalcost) {
        this.totalcost = totalcost;
    }

   
    
}
