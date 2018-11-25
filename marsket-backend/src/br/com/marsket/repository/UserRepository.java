package br.com.marsket.repository;

import java.util.ArrayList;

import br.com.marsket.model.User;
import br.com.marsket.util.UserTypeEnum;

public class UserRepository implements BaseRepository<User> {

	public ArrayList<User> Users;
	
	
	public UserRepository() {
		
		this.Users = new ArrayList<User>();
		this.Users.add(new User("gabriel", "123", UserTypeEnum.EMPLOYEE));
		this.Users.add(new User("renan", "123", UserTypeEnum.EMPLOYEE));
		this.Users.add(new User("pedro", "123", UserTypeEnum.EMPLOYEE));
		
	}
	
	
	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean getLogin(String username, String password) {
		
		for(User user : Users) {			
			if(user.getUsername().equals(username) 
					&& user.getPassword().equals(password)) {
				
				return true;				
			}			
		}
		
		return false;
	}

}
