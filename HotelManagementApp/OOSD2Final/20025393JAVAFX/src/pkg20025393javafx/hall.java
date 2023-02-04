/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20025393javafx;

/**
 *
 * @author angel
 */
import javafx.beans.property.SimpleStringProperty;

public class hall {
    private  SimpleStringProperty  leasNum;
    private  SimpleStringProperty  hallNumber;   
    private  SimpleStringProperty  hallName;
    private  SimpleStringProperty  roomNum;
    private  SimpleStringProperty  rentalRate;
    private  SimpleStringProperty  cusName;
    private  SimpleStringProperty  occupStatus;
    public hall(String leasNum, String hallNumber, String hallName,
            String roomNum, String rentalRate, String cusName, String occupStatus) {
        this.leasNum = new SimpleStringProperty (leasNum);
        this.hallNumber = new SimpleStringProperty (hallNumber);
        this.hallName = new SimpleStringProperty (hallName);
        this.roomNum = new SimpleStringProperty (roomNum);
        this.rentalRate = new SimpleStringProperty (rentalRate);
        this.cusName = new SimpleStringProperty (cusName);
        this.occupStatus= new SimpleStringProperty(occupStatus);
    }
    public String getLeasNum() {

        return leasNum.get();
            
    }
    public void setLeaseNum(String leasNum){
        this.leasNum = new SimpleStringProperty(leasNum);
    }
    public String getHallNum() {
        return hallNumber.get();
    }
    public void setHallNum(String halName){
        this.hallNumber = new SimpleStringProperty(halName);
    }
    public String getHallName() {
        return hallName.get();
    }
    public void setHallName(String hallName){
        this.hallName = new SimpleStringProperty(hallName);
    }
    public String getRoomNum() {
        return roomNum.get();
    }
    public void setRoomNum(String roomNum){
        this.roomNum = new SimpleStringProperty(roomNum);
    }
    public String getRentRate() {
        return rentalRate.get();
    }
    public void setRentRate(String rentalRate){
        this.rentalRate = new SimpleStringProperty(rentalRate);
    }
    public String getCusName() {
        return cusName.get();
    }
    public void setCusName(String cusName){
        this.cusName = new SimpleStringProperty(cusName);
    }
    public String getOccupStatus() {
        return occupStatus.get();
    }
    public void setOccupStatus(String occupStatus){
        this.occupStatus = new SimpleStringProperty(occupStatus);
    }
}

 

