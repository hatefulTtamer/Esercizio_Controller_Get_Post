package co.develhope.controllers;

import co.develhope.entities.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "User name's list", description = "A list of all User name's and reversed name's")
@RequestMapping(path = "/user")
public class NameController {
    @Autowired(required = false)
    User user;

    @GetMapping
    @Operation(summary = "Get the User name", description = "")
    public String getUserName(@Parameter(description = "Insert a name") @RequestParam String name) {
        User user = new User(name);
        return "Your name is " + user.getName();
    }

    @PostMapping
    @Operation(summary = "Get the User name reversed", description = "")
    public String getUserReverseName(@Parameter (description = "Reverse this name") @RequestParam String name) {
        User user = new User(name);
        return "Your reversed name is " + user.reverseName(user.getName());
    }

}
