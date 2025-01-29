package com.jwt_example.services;

import com.jwt_example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Pramod Kumar","pramod@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Aman Kumar","aman@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Raman Kumar","raman@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Suman Kumar","suman@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}
