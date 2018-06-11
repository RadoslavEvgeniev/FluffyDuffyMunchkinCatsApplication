package app.models;

import java.time.LocalDate;
import java.util.Date;

public class User {

    private String username;
    private String password;
    private LocalDate registrationDate;

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.setRegistrationDate(LocalDate.now());
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
