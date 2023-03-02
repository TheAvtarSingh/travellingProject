package org.ncu.travellingProject.entity;

public class HotelOwner {
private int ownerId;
private String ownerName;
private String owneraddress;
private int ownernumber;
private String owneremail;
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getOwneraddress() {
	return owneraddress;
}
public void setOwneraddress(String owneraddress) {
	this.owneraddress = owneraddress;
}
public int getOwnernumber() {
	return ownernumber;
}
public void setOwnernumber(int ownernumber) {
	this.ownernumber = ownernumber;
}
public String getOwneremail() {
	return owneremail;
}
public void setOwneremail(String owneremail) {
	this.owneremail = owneremail;
}
@Override
public String toString() {
	return "HotelOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", owneraddress=" + owneraddress
			+ ", ownernumber=" + ownernumber + ", owneremail=" + owneremail + "]";
}


}
