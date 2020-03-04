package com.spring.eeg.Model;

import com.spring.eeg.mbg.model.Userlogin;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
public class User extends Userlogin implements UserDetails {
    List<SimpleGrantedAuthority> authorities = new ArrayList<>();

    public User(Userlogin userlogin) {
        this.setUseraddress(userlogin.getUseraddress());
        this.setUserage(userlogin.getUserage());
        this.setUseremail(userlogin.getUseremail());
        this.setUserid(userlogin.getUserid());
        this.setUsername(userlogin.getUsername());
        this.setUsersex(userlogin.getUsersex());
        this.setUserrole(userlogin.getUserrole());
        this.setUserphone(userlogin.getUserphone());
        this.setUserpassword(userlogin.getUserpassword());
        authorities.add(new SimpleGrantedAuthority(userlogin.getUserrole()));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.getUserpassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
