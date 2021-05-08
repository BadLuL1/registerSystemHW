package registerSystemHW.core.abstracts;

import registerSystemHW.entities.concretes.User;

public interface LinkVerifyService {
	boolean clickToVerify(User user);
}
