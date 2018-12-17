package edu.mum.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Ganbat Bayar
 * On: 12/17/2018
 * Project: Ticket_Booker
 */
@Entity
public class User {
    @Id
    @Column(nullable = false, unique = true)
    String username;
    @Column(nullable = false)
    String password;
    String verifyPassword;
    Boolean enabled;

    @OneToOne(mappedBy="user", cascade = CascadeType.PERSIST)
    private Member member;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="credentials_id")
    List<Authority> authority = new ArrayList<Authority>();
}
