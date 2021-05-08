package registerSystemHW.business.concretes;

import java.util.ArrayList;

import registerSystemHW.business.abstracts.UserService;
import registerSystemHW.core.abstracts.EmailVerifyService;
import registerSystemHW.core.abstracts.VerifyService;
import registerSystemHW.dataAcces.concretes.HibernateUserDao;
import registerSystemHW.entities.concretes.User;

public class UserManager implements UserService{
	
	EmailVerifyService emailVerify;
	HibernateUserDao userDao;
	VerifyService verifyService;
	ArrayList<User> users = new ArrayList<>();
	
	

	public UserManager(EmailVerifyService emailVerify, HibernateUserDao userDao, VerifyService verifyService,
			ArrayList<User> users) {
		super();
		this.emailVerify = emailVerify;
		this.userDao = userDao;
		this.verifyService = verifyService;
		this.users = users;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if (checkIfValidFirstAndLastName(user) && checkIfValidPassword(user) && checkIfValidEmail(user) && checkIfEmailExists(user)){
			verifyService.sendVerifyingLink(user);
			if(verifyService.checkIfVerified(user)){
			userDao.add(user);
			System.out.println(user.getFirstName()+" Kullanıcı eklenmiştir.");
		}
		else {
			System.out.println(user.getFirstName()+" Kullanıcı eklenemedi.");
		}
		}
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
    private boolean checkIfValidFirstAndLastName(User user){
        if(user.getFirstName().length()<2||user.getLastName().length()<2){
            System.out.println("Kullanıcı ad ve soyadınız en az 2 karakterden oluşmalıdır");
            return false;
        }
        return true;
    }
	
	private boolean checkIfValidPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Kullanıcı şifresi en az 6 karakterden oluşmalıdır.");
			return false;
		}
		else {
			return true;
		}
	}
	private boolean checkIfEmailExists(User user) {
		for(User userr :users) {
			if(userr.getEmail()==userr.getEmail()) {
				System.out.println("Bu eposta daha önceden alınmış.");
				return false;
			}
		}
		return true;
	}
	
    private boolean checkIfValidEmail(User user){
        if(!emailVerify.isEmailValid(user.getEmail())){
            System.out.println("Geçersiz bir email adresi girdiniz");
            return false;
        }
        return true;
    }
	
}
