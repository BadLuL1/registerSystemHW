package registerSystemHW.core.abstracts;

import registerSystemHW.entities.concretes.User;

public interface VerifyService {
	void sendVerifyingLink(User user);
	boolean checkIfVerified(User user);
}
