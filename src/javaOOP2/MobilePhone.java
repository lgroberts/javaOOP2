package javaOOP2;

public class MobilePhone {
	
	public String brand = "";
	public String model = "";
	public String phoneNumber = "";
	public Integer storageCap = 0;

	public MobilePhone(String brand, String model, String phoneNumber, int storageCap) {
		this.brand = brand;
		this.model = model;
		this.phoneNumber = phoneNumber;
		this.storageCap = storageCap;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}
	
	public Integer getStorageCap() {
		return storageCap;
	}
	public void setStorageCap(Integer newStorageCap) {
		this.storageCap = newStorageCap;
	}

	void makeCall(String phoneNumber) {
		System.out.println("We are calling " + phoneNumber + " from our " + this.brand + " " + this.model + " phone!");
	}
	
	void installApp(String appName) {
		System.out.println("Installing " + appName + " on our " + this.brand + " " + this.model + " phone!");
	}
	
	void displayInfo() {
		System.out.println("\nBrand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Phone Number: " + this.phoneNumber);
		System.out.println("Storage Capacity: " + this.storageCap + "GB");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
