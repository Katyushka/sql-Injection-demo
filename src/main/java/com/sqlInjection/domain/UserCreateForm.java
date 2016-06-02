package com.sqlInjection.domain;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by user on 02.06.16.
 */
public class UserCreateForm {


    @NotEmpty
    private String login = "";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
