package org.csanchez.jenkins.plugins.kubernetes.auth;

public class KubernetesAuthKubeconfig implements KubernetesAuth {
    private final String kubeconfig;

    KubernetesAuthKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
    }

    public String getKubeconfig() {
        return kubeconfig;
    }

}
