package com.ibm.train.service;

import java.util.Collection;

import com.ibm.train.exception.InvalidTrainException;
import com.ibm.train.pojo.Train;

public interface TrainService {
	
	int addTrain(Train t);
	
	Train getTrain(int tcode) throws InvalidTrainException;
	
	Collection<Train> getAll();
}
