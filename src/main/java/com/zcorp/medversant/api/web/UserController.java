package com.zcorp.medversant.api.web;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcorp.medversant.api.model.User;
import com.zcorp.medversant.api.web.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    @Transactional
    public Optional<User> findUserByID(@Valid @PathVariable int id){
        return userService.findUserById(id);
    }

    @GetMapping("/users")
    public List<User> users() {
        return userService.getAll();
    }
    
    // @Autowired
    // private SecurityService securityService;
    // @Autowired
    // private UserValidator userValidator;


    // @RequestMapping(value = "/registration", method = RequestMethod.POST)
    // public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
    //     userValidator.validate(userForm, bindingResult);

    //     if (bindingResult.hasErrors()) {
    //         return "registration"; 
    //     }

    //     userService.save(userForm);

    //     securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

    //     return "redirect:/welcome";
    // }

    // @RequestMapping(value = "/login", method = RequestMethod.GET)
    // public String login(Model model, String error, String logout) {
    //     if (error != null)
    //         model.addAttribute("error", "Your username and password is invalid."); 
        
    //     if (logout != null) 
    //         model.addAttribute("message", "You have been logged out successfully");

    //     return "login";
    // }

    // @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    // public String welcome(Model model) {
    //     return "welcome";
    // }


}
