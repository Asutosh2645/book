package com.booking.repository;

import com.booking.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    // Additional custom query methods can be defined here if needed
}
