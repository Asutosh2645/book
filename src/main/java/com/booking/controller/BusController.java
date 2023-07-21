package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.payload.BusDTO;
import com.booking.service.BusService;

@RestController
@RequestMapping("/api/buses")
public class BusController {

    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping("/create")
    public ResponseEntity<BusDTO> createBus(@RequestBody BusDTO busDTO) {
        BusDTO createdBus = busService.createBus(busDTO);
        return new ResponseEntity<>(createdBus, HttpStatus.CREATED);
    }

    // Add other API endpoints and controller methods for managing buses

}
