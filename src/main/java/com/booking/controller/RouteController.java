package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.payload.RouteDTO;
import com.booking.service.RouteService;

@RestController
@RequestMapping("/api/routes")
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping("/create")
    public ResponseEntity<RouteDTO> createRoute(@RequestBody RouteDTO routeDTO) {
        RouteDTO createdRoute = routeService.createRoute(routeDTO);
        return new ResponseEntity<>(createdRoute, HttpStatus.CREATED);
    }

    // Add other API endpoints and controller methods for managing routes

}
