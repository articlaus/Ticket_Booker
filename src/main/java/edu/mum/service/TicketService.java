package edu.mum.service;

import edu.mum.dao.TicketDAO;
import edu.mum.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by: Ganbat Bayar
 * On: 12/19/2018
 * Project: Ticket_Booker
 */
@Service
public class TicketService {

    @Autowired
    TicketDAO ticketDAO;

    public List<Ticket> getTickets(Long id) {
        return ticketDAO.findByPassangerId(id);
    }
}
