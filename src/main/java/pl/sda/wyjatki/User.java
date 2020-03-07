package pl.sda.wyjatki;

import pl.sda.wyjatki.exceptions.EmailException;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if (!this.checkEmail(email)) {
            throw new EmailException("Niepoprawny email");
        } else {
            this.email = email;
        }
    }

    public boolean checkEmail(String email) {
        return email.contains("@");
    }
}
