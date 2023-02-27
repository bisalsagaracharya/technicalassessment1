package com.train.ticket.app.service;

import java.util.List;

 
import com.train.ticket.app.entity.Train;
import com.train.ticket.app.exception.TrainException;

public interface TrainService {
	
	 Train addNewTrain(Train train);
	 Train getTrainByTrainNo(String trainNo)throws TrainException;
	 List<Train> getAllTrain();
	 Train updateTrain(Train train);
	 String deleteTrainByTrainNo(String trainNo);
	 

}
