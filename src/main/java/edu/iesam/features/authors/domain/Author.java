package edu.iesam.features.authors.domain;

public class Author {

    private String id;
    private String name;
    private String bornDate;
    private String nationality;

    public Author(String id, String name, String bornDate, String nationality) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
