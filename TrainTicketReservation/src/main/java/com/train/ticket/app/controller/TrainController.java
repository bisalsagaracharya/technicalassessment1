package com.train.ticket.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.ticket.app.entity.Train;
import com.train.ticket.app.exception.TrainException;
import com.train.ticket.app.service.TrainService;

@RestController
@RequestMapping("train")
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	@PostMapping("train")
	public Train createTrain(@Valid @RequestBody Train train) {
		   Train addTrain = this.trainService.addNewTrain(train);
		   return addTrain;
	}
	@GetMapping("train/{trainNo}")
	public Train getTrainById(@PathVariable("trainNo") String trainNo) throws TrainException {
		                 
		Train trainByNo = this.trainService.getTrainByTrainNo(trainNo);
	     return trainByNo;
	}
	@PutMapping("train")
	public Train updateTrain(@Valid @RequestBody Train train) {
		 Train updateTrain = this.trainService.updateTrain(train);
		 return updateTrain;
	}
	@DeleteMapping("train/{trainNo}")
	public String deleteTrainByTrainNo(@PathVariable("trainNo") String trainNo) {
		String deleteTrainByNo = this.deleteTrainByTrainNo(trainNo);
		return deleteTrainByNo;
	}
	@GetMapping("trains")
	public List<Train> getAllTrains(){
		List<Train> allTrain = this.trainService.getAllTrain();
		return allTrain;
	}
	 
}
