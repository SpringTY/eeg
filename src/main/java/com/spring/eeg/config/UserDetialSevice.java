package com.spring.eeg.config;

import com.spring.eeg.Dao.UserLoginDao;
import com.spring.eeg.Model.User;
import com.spring.eeg.mbg.model.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserDetialSevice implements UserDetailsService {
    @Autowired
    UserLoginDao userLoginDao;

    @Override
    public UserDetails loadUserByUsername(String userPhone) throws UsernameNotFoundException {

        Userlogin userlogin = userLoginDao.getUserLoginByPhone(userPhone);
        if (userlogin == null) {
            throw new UsernameNotFoundException("Not found");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(userlogin.getUserrole()));
        return new User(userlogin);
    }
}
