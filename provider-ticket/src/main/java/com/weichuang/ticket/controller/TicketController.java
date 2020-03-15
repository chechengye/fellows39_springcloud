package com.weichuang.ticket.controller;

import com.weichuang.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping("/ticket")
    public String ticket(){
        return ticketService.saleTicket();
    }
}
