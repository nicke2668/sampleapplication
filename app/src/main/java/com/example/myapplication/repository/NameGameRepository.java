package com.example.myapplication.repository;

import com.example.myapplication.model.DashboardModel;

public class NameGameRepository {
    public static final NameGameRepository INSTANCE = new NameGameRepository(); //

    public void fetchPeople() {

    }

    public DashboardModel getModel() {
        return new DashboardModel();
    }
}
