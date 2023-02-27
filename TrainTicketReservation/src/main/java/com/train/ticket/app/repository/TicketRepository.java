package com.train.ticket.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.train.ticket.app.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket,String> {

	void deleteAllByPnr(String pnr);

	Ticket getTicketByPnr(String pnr);

}
