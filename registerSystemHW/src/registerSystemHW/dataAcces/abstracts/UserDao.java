package registerSystemHW.dataAcces.abstracts;

import java.util.List;

import registerSystemHW.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	void getAll(List<User>users);
}
