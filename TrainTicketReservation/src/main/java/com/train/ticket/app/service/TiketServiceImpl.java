package com.train.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.train.ticket.app.entity.Passenger;
import com.train.ticket.app.entity.Ticket;
import com.train.ticket.app.entity.Train;
import com.train.ticket.app.exception.TicketException;
import com.train.ticket.app.exception.TrainException;
import com.train.ticket.app.repository.TicketRepository;
import com.train.ticket.app.repository.TrainRepository;

@Service
public class TiketServiceImpl implements TicketService{
	
	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private TrainRepository trainRepository;

	@Override
	public Ticket addTicket(Ticket ticket) {

		return this.ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicketByPnr(String pnr) {
		this.ticketRepository.deleteAllByPnr(pnr);
	}

	@Override
	public Ticket getTicketByPnr(String pnr) {

		return this.ticketRepository.getTicketByPnr(pnr);
	}

	@Override
	public Ticket addTrainIntoTicketAndQty(String trainNo, String pnr, Integer qty)
			throws TicketException, TrainException {
		Optional<Ticket> findById = this.ticketRepository.findById(pnr);
		if (findById.isEmpty()) {
			throw new TrainException("Ticket not found");

		}
		Ticket ticket = findById.get();
		Optional<Train> findById2 = this.trainRepository.findById(trainNo);
		if (findById2.isEmpty()) {
			throw new TicketException(" Train not found");
		}
		Train train = findById2.get();

		ticket.setTrain(train);
		ticket.setQty(qty);

		return this.ticketRepository.save(ticket);

	}

	@Override
	public Double calculatePassengerFare(Passenger passenger) {
		return null;
	}
  
	
}
