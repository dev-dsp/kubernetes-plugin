package org.csanchez.jenkins.plugins.kubernetes.auth;

public class KubernetesAuthUsernamePassword implements KubernetesAuth {
    private final String username;

    private final String password;


    KubernetesAuthUsernamePassword(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
