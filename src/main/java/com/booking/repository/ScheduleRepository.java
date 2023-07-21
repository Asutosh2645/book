package com.booking.repository;

import com.booking.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // Additional custom query methods can be defined here if needed
}
