package registerSystemHW.core.concretes;

import registerSystemHW.googleAuthenticationModule.GoogleAuthenticationManager;
import registerSystemHW.googleAuthenticationModule.GoogleUserDetails;

public class GoogleAuthenticationManagerAdapter {
	
	GoogleAuthenticationManager manager = new GoogleAuthenticationManager();
    GoogleUserAdapter adapter = new GoogleUserAdapter();
    GoogleUserDetails googleUser;
    
    public GoogleAuthenticationManagerAdapter(GoogleUserDetails googleUser){
        this.googleUser = googleUser;
    }

    public void register(){
        manager.register(googleUser);
    }

    public void login(){
        manager.login(googleUser);
    }
}
