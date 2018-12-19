package edu.mum.service;

import edu.mum.dao.FlightDAO;
import edu.mum.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by: Ganbat Bayar
 * On: 12/18/2018
 * Project: Ticket_Booker
 */
@Service
public class FlightService {

    @Autowired
    FlightDAO flightDAO;

    public List<Flight> getFlights() {
        return flightDAO.findAll();
    }

    public ResponseEntity getFlight(Long id) {
        Flight flight = flightDAO.findOne(id);
        return ResponseEntity.ok(flight);
    }
}
