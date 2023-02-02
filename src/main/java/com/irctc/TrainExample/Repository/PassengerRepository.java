package com.irctc.TrainExample.Repository;

import com.irctc.TrainExample.model.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository  extends JpaRepository<Passengers,Integer> {
}
