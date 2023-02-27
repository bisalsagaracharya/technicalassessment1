package com.train.ticket.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.ticket.app.entity.Ticket;
import com.train.ticket.app.exception.TicketException;
import com.train.ticket.app.exception.TrainException;
import com.train.ticket.app.service.TicketService;

@RestController
@RequestMapping("ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	
	
	@PostMapping("ticket")
	public Ticket createNewTicket(@Valid@RequestBody Ticket ticket) {
		
		return this.ticketService.addTicket(ticket);
	}
	
	@DeleteMapping("ticket/{pnr}")
	public String deleteTicket(@PathVariable String pnr) {
		
		this.ticketService.deleteTicketByPnr(pnr);
		return "Ticket got deleted successfully";
	}
	@GetMapping("ticket/{pnr}")
	public Ticket getTicket(@PathVariable String pnr) {
		return this.ticketService.getTicketByPnr(pnr);
	}
	
	@PostMapping("train/ticket/qty/{trainno}/{pnr}/{qty}")
	public Ticket reserveTrainTicket(@PathVariable("trainno") String trainNo, @PathVariable("pnr") String pnr, @PathVariable("qty") Integer qty) throws TicketException, TrainException {
		
		return this.ticketService.addTrainIntoTicketAndQty(trainNo, pnr, qty);
	}
	
	

}
