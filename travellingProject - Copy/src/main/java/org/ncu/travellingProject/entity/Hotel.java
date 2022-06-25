package org.ncu.travellingProject.entity;

import java.util.HashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Hotel {
	
	private int hotelNumber;
	@NotEmpty(message="this field is required")
	private String hotelName;
	@NotEmpty(message="this field is required")
	private String hotelCountry;
	@NotEmpty(message="this field is required")
	private String hotelCity;
	@NotEmpty(message="this field is required")
	private String roomAvailable;
	
	private String hotelStatus;
	private int hotelRating;
	
	private int phoneNumber;
	
	@Email
	private String email;
	

	private int Price;
	private HashMap<String, String> hotelCityOptions;
	public HashMap<String, String> getHotelCityOptions() {
		return hotelCityOptions;
	}

	public void setHotelCityOptions(HashMap<String, String> hotelCityOptions) {
		this.hotelCityOptions = hotelCityOptions;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	private int Pincode;
	private String landmark;

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getHotelNumber() {
		return hotelNumber;
	}

	public void setHotelNumber(int hotelNumber) {
		this.hotelNumber = hotelNumber;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCountry() {
		return hotelCountry;
	}

	public void setHotelCountry(String hotelCountry) {
		this.hotelCountry = hotelCountry;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getRoomAvailable() {
		return roomAvailable;
	}

	public void setRoomAvailable(String roomAvailable) {
		this.roomAvailable = roomAvailable;
	}

	public String getHotelStatus() {
		return hotelStatus;
	}

	public void setHotelStatus(String hotelStatus) {
		this.hotelStatus = hotelStatus;
	}

	public int getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Hotel [hotelNumber=" + hotelNumber + ", hotelName=" + hotelName + ", hotelCountry=" + hotelCountry
				+ ", hotelCity=" + hotelCity + ", roomAvailable=" + roomAvailable + ", hotelStatus=" + hotelStatus
				+ ", hotelRating=" + hotelRating + ", phoneNumber=" + phoneNumber + ", email=" + email + ", Price="
				+ Price + ", Pincode=" + Pincode + ", landmark=" + landmark + "]";
	}

	
	public Hotel() {
		hotelCityOptions = new HashMap<>();
		hotelCityOptions.put("Delhi", "Delhi");
		hotelCityOptions.put("Haryana", "Haryana");
		hotelCityOptions.put("UttarPradesh", "Uttar Pradesh");
		hotelCityOptions.put("Punjab", "Punjab");
		hotelCityOptions.put("Maharashtra", "Maharashtra");
		hotelCityOptions.put("HimachalPradesh", "Himachal Pradesh");
		hotelCityOptions.put("Rajasthan", "Rajasthan");
		hotelCityOptions.put("TamilNadu", "Tamil Nadu");
		hotelCityOptions.put("Karnataka", "Karnataka");
		hotelCityOptions.put("Assam", "Assam");
		hotelCityOptions.put("MadhyaPradesh", "Madhya Pradesh");
	}
}
