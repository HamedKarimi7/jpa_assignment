package se.lexicon.hamed.jpa_assignment.entity;

import java.util.Objects;


public class Ingredient {

    private int id;
    private String Salt;

    public Ingredient() {
    }

    public Ingredient(String salt) {
        Salt = salt;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id && Objects.equals(Salt, that.Salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Salt);
    }



}

