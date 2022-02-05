package com.example.schronisko2.Objects;

import com.example.schronisko2.Activities.AnimalListActivity;

public class AnimalObject {

    private int id;
    private String name, age, sex, description;
    private String photo_path;

    public AnimalObject(){

    }

    public AnimalObject(int id, String name, String age, String photo_path, String sex, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.photo_path = photo_path;
        this.sex = sex;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
