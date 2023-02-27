package com.train.ticket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.ticket.app.entity.Train;
import com.train.ticket.app.exception.TrainException;
import com.train.ticket.app.repository.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepo;

	@Override
	public Train addNewTrain(Train train) {
		    Train save = this.trainRepo.save(train);
		    return save;
	}

	@Override
	public Train getTrainByTrainNo(String trainNo) throws TrainException {
		    Optional<Train> train = this.trainRepo.findById(trainNo);
		    if(train.isEmpty()) {
		    	throw new TrainException("Train Is Not Found With Train NO:"+trainNo+"Try Another"); 
		    }
		    Train train2 = train.get();
		return train2;
	}

	@Override
	public Train updateTrain(Train train) {
		      Train train1 =  this.trainRepo.save(train);
		return train1;
	}

	@Override
	public String deleteTrainByTrainNo(String trainNo) {
		    this.trainRepo.deleteById(trainNo);
		return "Train Is Sucessfully Deleted With Train No"+trainNo;
	}


	@Override
	public List<Train> getAllTrain() {
		 List<Train> trains=   this.trainRepo.findAll();
		return trains;
	}

}
