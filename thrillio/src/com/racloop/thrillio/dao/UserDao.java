package com.racloop.thrillio.dao;

import com.racloop.thrillio.DataStore;
import com.racloop.thrillio.entities.User;

public class UserDao {
    public User[] getUsers(){
        return DataStore.getUsers();
    }
}
