package com.example.placementmodule.UserController;

import com.example.placementmodule.UserData;
import com.example.placementmodule.UserService.UserServicecls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserControllercls {
    private UserServicecls userServicecls;
    @Autowired
    public UserControllercls(UserServicecls userServicecls) {
        this.userServicecls = userServicecls;
    }
    @PostMapping ("/user/register")
    public UserData saveUserData(@RequestBody UserData userData){
        userServicecls.saveUserdata(userData);
        return this.userServicecls.saveUserdata(userData);
    }
}
