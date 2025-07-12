package com.example.todayHome.repository;

import com.example.todayHome.entity.TodayHome;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodayHomeRepository extends CrudRepository<TodayHome,Integer> {
}
