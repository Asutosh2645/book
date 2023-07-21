package com.booking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Bus;
import com.booking.entity.Route;
import com.booking.entity.Schedule;
import com.booking.payload.ScheduleDTO;
import com.booking.repository.BusRepository;
import com.booking.repository.RouteRepository;
import com.booking.repository.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final BusRepository busRepository;
    private final RouteRepository routeRepository;
    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository, ModelMapper modelMapper,BusRepository busRepository,RouteRepository routeRepository) {
        this.scheduleRepository = scheduleRepository;
        this.busRepository=busRepository;
        this.routeRepository= routeRepository;
    }

    @Override
    public ScheduleDTO createSchedule(ScheduleDTO scheduleDTO) {
    	 Schedule schedule = new Schedule();
    	    
    	    // Set the properties of the Schedule object
    	    schedule.setDepartureTime(scheduleDTO.getDepartureTime());
    	    schedule.setArrivalTime(scheduleDTO.getArrivalTime());
    	    schedule.setFare(scheduleDTO.getFare());
    	    schedule.setFrequency(scheduleDTO.getFrequency());
    	    
    	    // Retrieve the Bus and Route objects by their IDs and set them in the Schedule
    	    Bus bus = busRepository.findById(scheduleDTO.getBusId()).orElse(null);
    	    if (bus == null) {
    	        // Handle the case when the Bus with the given ID is not found
    	        // You can throw an exception or return an appropriate response
    	        // In this example, let's assume the Bus is required, so we throw an IllegalArgumentException
    	        throw new IllegalArgumentException("Bus not found with ID: " + scheduleDTO.getBusId());
    	    }
    	    schedule.setBus(bus);
    	    
    	    Route route = routeRepository.findById(scheduleDTO.getRouteId()).orElse(null);
    	    if (route == null) {
    	        // Handle the case when the Route with the given ID is not found
    	        // You can throw an exception or return an appropriate response
    	        // In this example, let's assume the Route is required, so we throw an IllegalArgumentException
    	        throw new IllegalArgumentException("Route not found with ID: " + scheduleDTO.getRouteId());
    	    }
    	    schedule.setRoute(route);
    	    
    	    // Save the Schedule
    	    Schedule savedSchedule = scheduleRepository.save(schedule);
    	    
    	    // Create and return the ScheduleDTO
    	    ScheduleDTO savedScheduleDTO = new ScheduleDTO();
    	    savedScheduleDTO.setId(savedSchedule.getId());
    	    savedScheduleDTO.setDepartureTime(savedSchedule.getDepartureTime());
    	    savedScheduleDTO.setArrivalTime(savedSchedule.getArrivalTime());
    	    savedScheduleDTO.setFare(savedSchedule.getFare());
    	    savedScheduleDTO.setFrequency(savedSchedule.getFrequency());
    	    savedScheduleDTO.setBusId(savedSchedule.getBus().getId());
    	    savedScheduleDTO.setRouteId(savedSchedule.getRoute().getId());
    	    
    	    return savedScheduleDTO;
    }

    // Implement other methods related to schedule operations
}