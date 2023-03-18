package com.zcorp.medversant.api.web;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zcorp.medversant.api.model.User;
import com.zcorp.medversant.api.web.payload.LoginRequest;
import com.zcorp.medversant.api.web.response.UserResponse;
import com.zcorp.medversant.api.web.service.UserService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HomeController {
    
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    
    public HomeController(final UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping(value = "/sign-up", consumes = {"text/html","application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> signup(@Valid @RequestBody User user) throws Throwable{ 
        UserResponse response = new UserResponse();
        response.setStatus(true);
        response.setMessage("New user store successfully.");
        try {
            userService.createUser(user);
            return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setStatus(false);
            response.setMessage("New user store error" +" " +e);
            return new ResponseEntity<UserResponse>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/login", consumes = {"text/html", "application/json"})
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest) throws Throwable{ 
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        User user = userService.findByUsername(loginRequest.getUsername());
        if (user != null && (user.getUsername().equals(loginRequest.getUsername()) && passwordEncoder.matches(loginRequest.getPassword(), user.getPassword()))) {
            map.put("status", "true"); 
            map.put("message", "User login successfully");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }else { 
            map.put("status", "false"); 
            map.put("message", "User login failed.");
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "welcome";
    }

}
