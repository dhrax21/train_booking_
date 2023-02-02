package com.irctc.TrainExample.Service;

import com.irctc.TrainExample.Repository.FoodOrderRepository;
import com.irctc.TrainExample.Repository.PassengerRepository;
import com.irctc.TrainExample.Repository.TrainRepository;
import com.irctc.TrainExample.model.FoodOrder;
import com.irctc.TrainExample.model.Passengers;
import com.irctc.TrainExample.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FoodOrderRepository foodOrderRepository;
    @Autowired
    TrainRepository trainRepository;


    public void addPassenger(Passengers passengers) {
        passengerRepository.save(passengers);
    }

    public int getPassengerByCity(String city){
        List<Train> trainList=trainRepository.findAll();
        int count=0;

        for(Train train : trainList){
            if(train.getSource().equals(city)){
                count++;
            }
        }

        return count;
    }

    public int getPriceOfOrder(Date d, int trainId){

        List<Passengers> passengers=passengerRepository.findAll();
        int ticketId=0;

        for(Passengers passengers1 : passengers){
            if(passengers1.getDate().equals(d) && passengers1.getTrainId()==trainId){
                ticketId=passengers1.getTicketId();
                break;
            }
        }
        List<FoodOrder> foodOrders = foodOrderRepository.findAll();

        int price=0;
        for(FoodOrder foodOrder : foodOrders){
            if(foodOrder.getTicketId()==(ticketId)){
                price=foodOrder.getPrice();
            }
        }
        return price;
    }
}
