package com.irctc.TrainExample.Controller;

import com.irctc.TrainExample.Service.PassengerService;
import com.irctc.TrainExample.model.Passengers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/savepass")
    public ResponseEntity<String> addPass(@RequestBody Passengers passengers){
        passengerService.addPassenger(passengers);
        return new ResponseEntity<>("Successfully added", HttpStatus.ACCEPTED);
    }

    @GetMapping("/getByCity{city}")
    public int getPassengerByCity(@PathVariable String city){
        return passengerService.getPassengerByCity(city);
    }
}
