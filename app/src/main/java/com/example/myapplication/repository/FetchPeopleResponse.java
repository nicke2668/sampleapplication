package com.example.myapplication.repository;

import com.example.myapplication.model.Person;

import java.util.List;

public class FetchPeopleResponse {

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    private List<Person> people;


}
