package com.jzpacheco.cryptovalue.domains.student;

public class Student {
    private String estudante;
    private String project;

    public Student(String estudante, String project) {
        this.estudante = estudante;
        this.project = project;
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
