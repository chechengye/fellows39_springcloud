package com.weichuang.ticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public String saleTicket(){
        System.out.println("8002");
        return "《西虹市首富》";
    }
}
