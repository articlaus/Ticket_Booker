package edu.mum.controller;

import edu.mum.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by: Ganbat Bayar
 * On: 12/18/2018
 * Project: Ticket_Booker
 */
@Controller
@SessionAttributes("user")
public class FlightController {

    @Autowired
    FlightService flightService;

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public String getFlights(Model model) {
        model.addAttribute("flights", flightService.getFlights());
        return "flights";
    }

    @RequestMapping(value = "/flights/{id}", method = RequestMethod.GET)
    public ResponseEntity bookFlight(@PathVariable("id") Long id) {
        return flightService.bookFlight(id);
    }
}
