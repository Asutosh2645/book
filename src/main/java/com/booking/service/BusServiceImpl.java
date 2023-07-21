package com.booking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Bus;
import com.booking.payload.BusDTO;
import com.booking.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {

    private final BusRepository busRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public BusServiceImpl(BusRepository busRepository, ModelMapper modelMapper) {
        this.busRepository = busRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BusDTO createBus(BusDTO busDTO) {
        Bus bus = modelMapper.map(busDTO, Bus.class);
        Bus savedBus = busRepository.save(bus);
        return modelMapper.map(savedBus, BusDTO.class);
    }

    // Implement other methods related to bus operations
}