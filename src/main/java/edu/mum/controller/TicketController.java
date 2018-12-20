package edu.mum.controller;

import edu.mum.entity.Member;
import edu.mum.entity.UserCredentials;
import edu.mum.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by: Ganbat Bayar
 * On: 12/19/2018
 * Project: Ticket_Booker
 */
@Controller
@SessionAttributes("user")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/user/tickets", method = RequestMethod.GET)
    public String getTickets(@ModelAttribute(value = "user") Member member, Model model) {
        model.addAttribute("tickets", ticketService.getTickets(member.getId()));
        return "tickets";
    }
}
