package com.train.ticket.app.service;

import com.train.ticket.app.entity.Passenger;
import com.train.ticket.app.entity.Ticket;
import com.train.ticket.app.exception.TicketException;
import com.train.ticket.app.exception.TrainException;

public interface TicketService {
	
	Ticket addTicket(Ticket ticket);

	void deleteTicketByPnr(String pnr);

	Ticket getTicketByPnr(String pnr);
	
	Ticket addTrainIntoTicketAndQty(String trainNo, String pnr, Integer qty) throws TicketException, TrainException;
	
	public Double calculatePassengerFare(Passenger passenger);
}
	 


