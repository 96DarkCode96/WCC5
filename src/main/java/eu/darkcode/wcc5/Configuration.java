package eu.darkcode.wcc5;

import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @org.springframework.context.annotation.Bean
    public User mother(@Value("${mother.firstname}") String firstname, @Value("${mother.lastname}") String lastname) {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        return user;
    }

    @org.springframework.context.annotation.Bean
    public User father(@Value("${father.firstname}") String firstname, @Value("${father.lastname}") String lastname) {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        return user;
    }

    @org.springframework.context.annotation.Bean
    public User sister(@Value("${sister.firstname}") String firstname, @Value("${sister.lastname}") String lastname) {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        return user;
    }

    @org.springframework.context.annotation.Bean
    public User me(@Value("${me.firstname}") String firstname, @Value("${me.lastname}") String lastname) {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        return user;
    }
}