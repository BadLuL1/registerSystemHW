package registerSystemHW.business.concretes;

import registerSystemHW.business.abstracts.AuthenticationService;
import registerSystemHW.business.abstracts.UserService;
import registerSystemHW.core.abstracts.EmailVerifyService;
import registerSystemHW.entities.concretes.User;

public class AuthenticationManager implements AuthenticationService{
	
	EmailVerifyService emailVerify;
	AuthenticationService authenticationService;
	UserService userService;
	
	public AuthenticationManager(UserService userService) {
		this.userService=userService;
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userService.add(user);
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" giriş yapıldı.");
	}

}
