package com.springboot.practice.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.jws.soap.SOAPBinding;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAOService userDAOService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userDAOService.findAll();
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable Integer id){
        User user = userDAOService.getUserById(id);
        if(user== null){
            throw new UserNotFoundException("User Id not found");
        }
        return user;
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveUser(@RequestBody User user) {
      user =  userDAOService.saveUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/find/{id}").buildAndExpand(user.getId()).toUri();
      return ResponseEntity.created(location).build();
    }
}
