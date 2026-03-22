package com.pacoceronspringboot.entrevista_backend.model;

public class libro {
    private String id;
    private String title;
    private String autor;

    //Constructor vacío
    public libro() {}

    //Constructor copleto
    public libro(String id, String title, String autor) {
        this.id =id;
        this.title = title;
        this.autor = autor;
            }
    //Getters y setters (JSON)
    public String getId() {return id;}
    public void setId (String id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle (String title) {this.title =title;}
    public String getAutor() {return autor;}
    public void setAutor (String autor) {this.autor = autor;}

}

