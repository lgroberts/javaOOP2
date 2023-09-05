package javaOOP2;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobilePhone newObj =  new MobilePhone("Apple", "iPhone 11", "4805445099", 64);
		
		newObj.makeCall("4805445099");
		newObj.installApp("SquadApp");
		newObj.displayInfo();
	}

}
