package org.csanchez.jenkins.plugins.kubernetes.auth;

public class KubernetesAuthToken implements KubernetesAuth {
    private final String token;

    KubernetesAuthToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
