package com.racloop.thrillio.managers;

import com.racloop.thrillio.dao.UserDao;
import com.racloop.thrillio.entities.User;

// Mangers are the singletons here
// Singleton is a design pattern which makes sure only one object of the class is created.
// This is achieved with the help of a private constructor as having a private constructor means one cannot instantiate
// the class.
public class UserManager {
    private static UserManager instance = new UserManager(); // static methods will access static variable.
    private static UserDao dao = new UserDao();
    private UserManager(){} // private constructor.
    public static UserManager getInstance(){
        return instance;
    }

    public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
                           String userType){
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);

        return user;

    }
    public User[] getUsers(){
        return dao.getUsers();
    }
}
