package registerSystemHW.dataAcces.concretes;

import java.util.List;

import registerSystemHW.dataAcces.abstracts.UserDao;
import registerSystemHW.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" Sisteme hibernate ile eklenmiştir.");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" Sistemde hibernate ile güncellenmiştir.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" Sistemden hibernate ile silinmiştir.");
	}

	@Override
	public void getAll(List<User> users) {
		// TODO Auto-generated method stub
		for(User user:users) {
			System.out.println(user.getFirstName()+" -- "+user.getEmail());
		}
	}

	

}
