package com.train.ticket.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.train.ticket.app.entity.Train;

public interface TrainRepository extends MongoRepository<Train, String> {

}
