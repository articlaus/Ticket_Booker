package edu.mum.controller;

import edu.mum.model.UserModel;
import edu.mum.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by: Ganbat Bayar
 * On: 12/18/2018
 * Project: Ticket_Booker
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    TokenService tokenService;

    @RequestMapping(value = "/create", produces = "application/json", method = RequestMethod.POST)
    public ResponseEntity createToken(@RequestBody UserModel userModel) {
        return tokenService.getToken(userModel);
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public ResponseEntity checkToken(@RequestHeader("token") String token) {
        return tokenService.checkToken(token);
    }
}
