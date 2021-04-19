package com.ibm.train.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.train.exception.InvalidTrainException;
import com.ibm.train.pojo.Train;
import com.ibm.train.repo.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainRepository repo;
	
	@Override
	public int addTrain(Train t) {
		return repo.saveTrain(t);
	}

	@Override
	public Train getTrain(int tcode) throws InvalidTrainException {
		Train t = repo.fetchTrain(tcode);
		if(t !=null)
			return t;
		throw new InvalidTrainException("Invalid Train code:" + tcode);
	}

	@Override
	public Collection<Train> getAll() {
		return repo.fetchAll();
	}
}
