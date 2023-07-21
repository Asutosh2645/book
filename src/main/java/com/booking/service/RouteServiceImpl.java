package com.booking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Route;
import com.booking.payload.RouteDTO;
import com.booking.repository.RouteRepository;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RouteDTO createRoute(RouteDTO routeDTO) {
        Route route = modelMapper.map(routeDTO, Route.class);
        Route savedRoute = routeRepository.save(route);
        return modelMapper.map(savedRoute, RouteDTO.class);
    }

    // Implement other methods related to route operations
}