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
        return (List<TodayHome>) todayHomeRepository.findAll();
    }

    @Override
    public TodayHome updateTodayHome(TodayHome todayHome, int id) {
        TodayHome fixedTodayHome = todayHomeRepository.findById(id).orElse(null);

        if(Objects.isNull(fixedTodayHome)) {
            return null;
        }

        fixedTodayHome.setUpdate(
                todayHome.getName(),
                todayHome.getPrice(),
                todayHome.getCategory(),
                todayHome.getWidth(),
                todayHome.getDepth(),
                todayHome.getHeight()
        );

        return todayHomeRepository.save(fixedTodayHome);
    }

    @Override
    public void deleteTodayHome(int id) {
        todayHomeRepository.deleteById(id);
    }
}
