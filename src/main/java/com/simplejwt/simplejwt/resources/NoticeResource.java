package com.simplejwt.simplejwt.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notice")
public class NoticeResource {
    
    @RequestMapping(method = RequestMethod.GET)
    public String getNotice() {
        return "Welcome to the notice page";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteNotice() {
        return "Access denied";
    }
}
