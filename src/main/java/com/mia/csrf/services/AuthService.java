package com.mia.csrf.services;

import com.mia.csrf.dtos.SignInDto;
import com.mia.csrf.dtos.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;
import java.security.SecureRandom;

@Service
@RequiredArgsConstructor
public class  AuthService {
    @Autowired
    private final PasswordEncoder passwordEncoder;
    private static final String HASHED_PASSWORD ="$2a$10$DZS6RwgZvZEEt03lGif1c.iswPMZnaR5mxexN8hxWw3CzKMNMJuja";

    public UserDto signIn(SignInDto signInDto){

      // String password= passwordEncoder.encode(CharBuffer.wrap(signInDto.password()));
        //System.out.println(password);
        if(passwordEncoder.matches(CharBuffer.wrap(signInDto.password()), HASHED_PASSWORD)){
            return new UserDto(1l, "login","Sergio");
        }
        throw new RuntimeException("Invalid Password");
    }
}
