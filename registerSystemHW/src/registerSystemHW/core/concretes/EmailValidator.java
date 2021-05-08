package registerSystemHW.core.concretes;

import java.util.regex.Pattern;

import registerSystemHW.core.abstracts.EmailVerifyService;

public class EmailValidator implements EmailVerifyService{

	private static final String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean isEmailValid(String emailInputMessage) {
		Pattern pattern = Pattern.compile(emailPattern,
				Pattern.CASE_INSENSITIVE);
		return pattern.matcher(emailInputMessage).find();
	}
	
	//Kod alıntıdır. : http://www.bahadirakin.com/regex-ile-email-kontrolu/
	
}
