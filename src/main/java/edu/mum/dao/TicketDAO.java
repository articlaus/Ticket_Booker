package edu.mum.dao;

import edu.mum.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by: Arti
 * On: 12/19/2018
 * Project: Ticket_Booker
 */
@Repository
public interface TicketDAO extends JpaRepository<Ticket, Long> {

    List<Ticket> findByPassangerId(Long passangerId);
}
