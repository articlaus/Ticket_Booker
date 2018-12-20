package edu.mum.service;

import edu.mum.dao.FlightDAO;
import edu.mum.entity.Flight;
import edu.mum.model.TicketModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    public ResponseEntity bookFlight(Long id) {
        try {
            Flight flight = flightDAO.findOne(id);
            TicketModel ticketModel = new TicketModel();
            ticketModel.setFlightId(flight.getId());
            ticketModel.setMemberId(1L);
            ticketModel.setToken("asd");
            String url = "http://172.19.144.224:8080/ea_proj_ticket_war_exploded/ticket/process";
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<TicketModel> request = new HttpEntity<>(ticketModel);
            ResponseEntity response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
