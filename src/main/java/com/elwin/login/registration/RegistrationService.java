package com.elwin.login.registration;

import com.elwin.login.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    public String register(RegistrationRequest request) {

        return "Test";
    }
}
