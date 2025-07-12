package com.example.todayHome.controller;

import com.example.todayHome.entity.TodayHome;
import com.example.todayHome.service.TodayHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodayHomeController {
    @Autowired private TodayHomeService todayHomeService;

    // Save
    @PostMapping("/todayHome")
    public TodayHome saveTodayHome(@RequestBody TodayHome todayHome) {
        return todayHomeService.saveTodayHome(todayHome);
    }

    @GetMapping("/todayHome")
    public List<TodayHome> getAllTodayHome() {
        return todayHomeService.fetchTodayHome();
    }

    @PutMapping("/todayHome/{id}")
    public TodayHome
    updateTodayHome(@PathVariable int id, @RequestBody TodayHome todayHome) {
        return todayHomeService.updateTodayHome(todayHome, id);
    }

    @DeleteMapping("/todayHome/{id}")
    public String deleteTodayHome(@PathVariable int id) {
        todayHomeService.deleteTodayHome(id);
        return "Delete Success";
    }
}
