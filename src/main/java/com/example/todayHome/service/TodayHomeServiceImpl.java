package com.example.todayHome.service;

import com.example.todayHome.entity.TodayHome;
import com.example.todayHome.repository.TodayHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TodayHomeServiceImpl implements TodayHomeService {

    @Autowired
    private TodayHomeRepository todayHomeRepository;

    @Override
    public TodayHome saveTodayHome(TodayHome todayHome) {
        return todayHomeRepository.save(todayHome);
    }

    @Override
    public List<TodayHome> fetchTodayHome() {
        return List.of((TodayHome) todayHomeRepository.findAll());
    }

    @Override
    public TodayHome updateTodayHome(TodayHome todayHome, int id) {
        TodayHome fixedTodayHome = todayHomeRepository.findById(id).orElse(null);

        if(Objects.isNull(fixedTodayHome)) {
            return null;
        }

        fixedTodayHome.setName(todayHome.getName());
        fixedTodayHome.setPrice(todayHome.getPrice());
        fixedTodayHome.setCategory(todayHome.getCategory());
        fixedTodayHome.setWidth(todayHome.getWidth());
        fixedTodayHome.setDepth(todayHome.getDepth());
        fixedTodayHome.setHeight(todayHome.getHeight());

        return todayHomeRepository.save(fixedTodayHome);
    }

    @Override
    public void deleteTodayHome(int id) {
        todayHomeRepository.deleteById(id);
    }
}
