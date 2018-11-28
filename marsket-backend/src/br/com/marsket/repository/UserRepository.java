package br.com.marsket.repository;

import br.com.marsket.model.User;
import br.com.marsket.util.UserTypeEnum;
import java.util.LinkedList;

public class UserRepository implements BaseRepository<User> {

    public LinkedList<User> Users;

    public UserRepository() {

        this.Users = new LinkedList<>();
        this.Users.add(new User("gabriel", "123", UserTypeEnum.EMPLOYEE));
        this.Users.add(new User("renan", "123", UserTypeEnum.EMPLOYEE));
        this.Users.add(new User("pedro", "123", UserTypeEnum.EMPLOYEE));

    }

    @Override
    public LinkedList<User> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getObject(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(User m) {
        // TODO Auto-generated method stub
    }

    @Override
    public void update(User m) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
    }

    public boolean getLogin(String username, String password) {

        for (User user : Users) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {

                return true;
            }
        }

        return false;
    }

}
