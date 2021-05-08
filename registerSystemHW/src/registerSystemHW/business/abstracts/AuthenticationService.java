package registerSystemHW.business.abstracts;

import registerSystemHW.entities.concretes.User;

public interface AuthenticationService{
	void register(User user);
	void login(User user);
}
