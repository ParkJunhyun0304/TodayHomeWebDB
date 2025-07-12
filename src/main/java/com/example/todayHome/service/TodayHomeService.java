package com.example.todayHome.service;

import com.example.todayHome.entity.TodayHome;

import java.util.List;

public interface TodayHomeService {

    // save
    TodayHome saveTodayHome(TodayHome todayHome);
    // Read
    List<TodayHome> fetchTodayHome();
    // update
    TodayHome updateTodayHome(TodayHome todayHome, int id);
    // delte
    void deleteTodayHome(int id);
}
