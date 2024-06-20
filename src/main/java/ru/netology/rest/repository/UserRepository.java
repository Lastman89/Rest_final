package ru.netology.rest.repository;

import org.springframework.beans.factory.annotation.Value;
import ru.netology.rest.Authorities;

import java.util.List;

public class UserRepository {

    @Value("netology.user:Alex")
    private String user;
    @Value("netology.password:Fuck")
    private String password;

    public List<Authorities> getUserAuthorities(String user, String password) {
        //List<Authorities> authorities = List.of();
        //authorities.add(Authorities.values);
//        if (user !=  null && password != null) {
//            authorities.add(Authorities.values);
//            return List.of(Authorities.values());
//        }
        return List.of(Authorities.values());
    }
}
