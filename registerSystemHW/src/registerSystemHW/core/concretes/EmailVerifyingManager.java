package registerSystemHW.core.concretes;

import registerSystemHW.core.abstracts.LinkVerifyService;
import registerSystemHW.core.abstracts.VerifyService;
import registerSystemHW.entities.concretes.User;

public class EmailVerifyingManager implements VerifyService{
	
	LinkVerifyService verifier;
	
	public EmailVerifyingManager(LinkVerifyService verifier) {
		this.verifier=verifier;
	}
	

	@Override
	public void sendVerifyingLink(User user) {
		// TODO Auto-generated method stub
		System.out.println("Doğrulama linki e-postanıza gönderilmiştir.");
	}

	@Override
	public boolean checkIfVerified(User user) {
		// TODO Auto-generated method stub
		if(!verifier.clickToVerify(user)) {
			return false;
		}
		return true;
	}



}
