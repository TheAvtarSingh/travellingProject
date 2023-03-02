package org.ncu.travellingProject.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import Validation.checkforZero;

public class UserBookingDetails {
	@NotNull
	@Range(min = 1,max=1000)
private int hotelid;
@NotNull
@Range(min = 1,max=10)
private int roomNumbers;
@NotNull
@Range(min = 1,max=10)
private int  noofdays;

private String needCarParking;

private String needFoodService;
private String needGamingService;
@NotNull
private String panNumber;
private String needSecurity;
@NotNull
@Range(min = 1,max=10)
private int noofPersons;
private String bookingStatus;
public String getBookingStatus() {
	return bookingStatus;
}
public void setBookingStatus(String bookingStatus) {
	this.bookingStatus = bookingStatus;
}
public int getHotelid() {
	return hotelid;
}
public void setHotelid(int hotelid) {
	this.hotelid = hotelid;
}
public int getRoomNumbers() {
	return roomNumbers;
}
public void setRoomNumbers(int roomNumbers) {
	this.roomNumbers = roomNumbers;
}
public int getNoofdays() {
	return noofdays;
}
public void setNoofdays(int noofdays) {
	this.noofdays = noofdays;
}
public String getNeedCarParking() {
	return needCarParking;
}
public void setNeedCarParking(String needCarParking) {
	this.needCarParking = needCarParking;
}
public String getNeedFoodService() {
	return needFoodService;
}
public void setNeedFoodService(String needFoodService) {
	this.needFoodService = needFoodService;
}
public String getNeedGamingService() {
	return needGamingService;
}
public void setNeedGamingService(String needGamingService) {
	this.needGamingService = needGamingService;
}
public String getPanNumber() {
	return panNumber;
}
public void setPanNumber(String panNumber) {
	this.panNumber = panNumber;
}
public String getNeedSecurity() {
	return needSecurity;
}
public void setNeedSecurity(String needSecurity) {
	this.needSecurity = needSecurity;
}
public int getNoofPersons() {
	return noofPersons;
}
public void setNoofPersons(int noofPersons) {
	this.noofPersons = noofPersons;
}
@Override
public String toString() {
	return "UserBookingDetails [hotelid=" + hotelid + ", roomNumbers=" + roomNumbers + ", noofdays=" + noofdays
			+ ", needCarParking=" + needCarParking + ", needFoodService=" + needFoodService + ", needGamingService="
			+ needGamingService + ", panNumber=" + panNumber + ", needSecurity=" + needSecurity + ", noofPersons="
			+ noofPersons + ", bookingStatus=" + bookingStatus + "]";
}


}
