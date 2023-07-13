package com.elwin.login.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String firstName;

    private final String lastName;
    private final String email;
    private final String password;

}
