package edu.mum.model;

/**
 * Created by: Ganbat Bayar
 * On: 12/19/2018
 * Project: Ticket_Booker
 */
public class TicketModel {
    Long  flightId;
    Long memberId;
    String token;

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
