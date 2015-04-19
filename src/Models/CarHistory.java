package Models;

import java.util.Date;

/**
 * Created by Frank Brandstetter on 4/19/2015.
 */
public class CarHistory
{
    public CarHistory(){}

    public int getHistoryID() {
        return historyID;
    }

    public void setHistoryID(int historyID) {
        this.historyID = historyID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int historyID;
    public int carID;
    public Date actionDate;
    public String description;
}