//Bu kod yardımlar sayesinde yapıldır.

package registerSystemHW;

import java.util.ArrayList;

import registerSystemHW.business.concretes.AuthenticationManager;
import registerSystemHW.business.concretes.UserManager;
import registerSystemHW.core.concretes.EmailValidator;
import registerSystemHW.core.concretes.EmailVerifyingManager;
import registerSystemHW.core.concretes.GoogleAuthenticationManagerAdapter;
import registerSystemHW.core.concretes.LinkVerifierManager;
import registerSystemHW.dataAcces.concretes.HibernateUserDao;
import registerSystemHW.entities.concretes.User;
import registerSystemHW.googleAuthenticationModule.GoogleUserDb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User user = new User(1, "Mehmet", "Dızcı", "xKralTr@hotmail.com", "1356498");
        User user2 = new User(2, "Doğukan", "Koyunkesen", "sigara@Bore.com", "koyuncu");
        User user3 = new User(2, "Bora", "Lark", "sigara@Bore.com", "sdfgadfg");
        User user4 = new User(4, "Gernas", "Kilic", "gernas@gernas.com", "123456");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        GoogleUserDb googleUserDb = new GoogleUserDb();
        googleUserDb.getUsers();

        AuthenticationManager authenticationManager = new AuthenticationManager(new UserManager(new EmailValidator(),new HibernateUserDao(), new EmailVerifyingManager(new LinkVerifierManager()), users));
        GoogleAuthenticationManagerAdapter googleAuthenticationManagerAdapter  = new GoogleAuthenticationManagerAdapter(googleUserDb.getUsers()[2]);

        googleAuthenticationManagerAdapter.register();
        
        googleAuthenticationManagerAdapter.login();
       
        authenticationManager.register(user4);
        
        authenticationManager.login(user);
       

	}

}
