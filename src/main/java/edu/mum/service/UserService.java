package edu.mum.service;

import edu.mum.dao.UserCredentialsDAO;
import edu.mum.entity.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by: Ganbat Bayar
 * On: 12/17/2018
 * Project: Ticket_Booker
 */
@Service
@Transactional
public class UserService {

    @Autowired
    UserCredentialsDAO credentailsDAO;

    public UserCredentials getUser(String username) {
        System.out.println("working");
        UserCredentials userCredentials = credentailsDAO.findByUsername(username);
        return userCredentials;
    }

}
