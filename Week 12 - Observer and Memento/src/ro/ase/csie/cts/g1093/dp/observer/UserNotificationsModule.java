package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface{

	public void connectionUp() {
		System.out.println("PopUp: Connection is active");
		
	}

	public void connectionDown() {
		System.out.println("PopUp: Connection to the server is lost");
		
	}

}
