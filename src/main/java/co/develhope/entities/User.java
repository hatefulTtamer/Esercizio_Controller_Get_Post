package co.develhope.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String reverseName (String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
