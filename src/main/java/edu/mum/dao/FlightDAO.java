package edu.mum.dao;

import edu.mum.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by: Arti
 * On: 12/18/2018
 * Project: Ticket_Booker
 */
@Repository
public interface FlightDAO extends JpaRepository<Flight, Long> {
}
