package com.irctc.TrainExample.Controller;

import com.irctc.TrainExample.Service.TrainService;
import com.irctc.TrainExample.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TrainController {
    @Autowired
    TrainService trainService;

    @PostMapping
    public ResponseEntity<String> addTrain(@RequestBody Train train){
        trainService.addTrain(train);
        return new ResponseEntity<>("Successfully added", HttpStatus.ACCEPTED);
    }


}
