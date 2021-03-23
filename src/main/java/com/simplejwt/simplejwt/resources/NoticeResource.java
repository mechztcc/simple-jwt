package com.simplejwt.simplejwt.resources;

import com.simplejwt.simplejwt.domain.User;
import com.simplejwt.simplejwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class NoticeResource {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id) {
        return userService.findUser(id);

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteUser() {
        return "Access denied";
    }
}
