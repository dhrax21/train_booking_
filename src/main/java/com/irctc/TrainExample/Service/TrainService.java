package com.irctc.TrainExample.Service;

import com.irctc.TrainExample.Repository.TrainRepository;
import com.irctc.TrainExample.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository;
    public void addTrain(Train train) {
        trainRepository.save(train);
    }


}
