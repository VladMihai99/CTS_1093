package ro.ase.csie.cts.g1093.dp.facade;

public class UserAPIFacade {

	// the facade method
	public static String getUserProfile(String user, String pass) {

		GameServer server = new GameServer();
		server.connect();

		Login login = new Login("player1", "1234");
		login.login();

		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();

		return profile;
	}
}
