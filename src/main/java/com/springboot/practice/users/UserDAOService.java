package com.springboot.practice.users;

import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDAOService {

    public static List<User> userList = new ArrayList<>();
    public static Integer userListCount = 3;

    static {
        userList.add(new User(1,"siva",24,"IT",new Date()));
        userList.add(new User(2,"kumar",25,"IT",new Date()));
        userList.add(new User(3,"raja",26,"IT",new Date()));
    }


    public List<User> findAll(){
        return userList;
    }

    public User getUserById(Integer id){
        if(id<=userList.size()) {
            return userList.get((id - 1));
        }
        return null;
    }

    public User saveUser(User user){
        if(user.getId() == null) {
            user.setId(++userListCount);
        }
        userList.add(user);
        return user;
    }
}
