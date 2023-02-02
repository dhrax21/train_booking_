package com.irctc.TrainExample.Repository;

import com.irctc.TrainExample.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer> {

}
