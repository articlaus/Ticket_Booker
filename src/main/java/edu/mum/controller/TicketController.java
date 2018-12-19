package edu.mum.controller;

import edu.mum.amqp.TicketServiceImpl;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createTicket() {

        System.out.println("Ticket AMQP...");
        ApplicationContext context = new GenericXmlApplicationContext(
                "classpath:context/ticket-app-context.xml");

        RabbitTemplate topicTemplate = context.getBean("directTemplate", RabbitTemplate.class);
        TicketServiceImpl ticketService = new TicketServiceImpl();
        ticketService.publish(topicTemplate);

        System.out.println("Ticket has sent to AMQP.");

        return "ticketlist";
    }

}
