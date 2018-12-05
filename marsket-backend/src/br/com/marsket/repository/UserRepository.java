package br.com.marsket.repository;

import br.com.marsket.model.User;
import java.util.LinkedList;

public class UserRepository {

    public LinkedList<User> listUsers;

    public UserRepository() {
        if (StaticRepository.initialize == false) {
            StaticRepository.initList();
        }
        this.listUsers = new LinkedList<>();
        StaticRepository.listUser.forEach((user) -> {
            listUsers.add(user);
        });
    }

    public boolean getLogin(String username, String password) {
        return listUsers.stream().anyMatch((user) -> (user.getUsername().equals(username)
                && user.getPassword().equals(password)));
    }

}
