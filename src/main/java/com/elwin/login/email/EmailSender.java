package com.elwin.login.email;

public interface EmailSender {
     default void send(String to, String email) {

    }
}
