package br.com.marsket.business;

import br.com.marsket.repository.UserRepository;

public class UserBusiness {

    public boolean getLogin(String username, String password) {

        return new UserRepository().getLogin(username, password);
    }

}
