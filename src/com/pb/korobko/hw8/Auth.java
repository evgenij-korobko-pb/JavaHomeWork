package com.pb.korobko.hw8;

public class Auth {

    private String login;
    private String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.matches("^[A-Za-z0-9]{5,20}$") && password.matches("^[A-Za-z0-9_]{5,20}$") && password.equals(confirmPassword)) {
            setLogin(login);
            setPassword(password);
            System.out.println("Вітаємо, Ви успішно зареєструвалися на сайті!");
        } else if(!login.matches("^[A-Za-z0-9]{5,20}$")) {
            System.out.println("Логін не відповідає вимогам!");
            throw new WrongLoginException();
        } else if (!password.matches("^[A-Za-z0-9_]{5,20}$")) {
            System.out.println("Пароль не відповідає вимогам!");
            throw new WrongPasswordException();
        } else if (!password.equals(confirmPassword)){
            System.out.println("Введені паролі не збігаються!");
            throw new WrongPasswordException();
        }
    }
    public void signUp(String login, String password) throws WrongLoginException {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Вітаємо, Ви успішно авторизувалися на сайті!");
        } else {
            System.out.println("Невірний логін або пароль!");
            throw new WrongLoginException();
        }
    }
}