package co.develhope.controllers;

import co.develhope.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class NameController {


    @GetMapping
    public String getUserName(@RequestParam String name) {
        User user = new User(name);
        return "Your name is " + user.getName();
    }

    @PostMapping
    public String getUserReverseName(@RequestParam String name) {
        User user = new User(name);
        return "Your reversed name is " + user.reverseName(user.getName());
    }

}
