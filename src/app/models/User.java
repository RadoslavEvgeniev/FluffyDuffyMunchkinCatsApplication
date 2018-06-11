package app.models;

import java.time.LocalDate;

public class User {

    private String username;
    private String password;
    private LocalDate registrationDate;
    private String role;

    public User(String username, String password, String role) {
        this.setUsername(username);
        this.setPassword(password);
        this.setRegistrationDate(LocalDate.now());
        this.setRole(role);
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

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
