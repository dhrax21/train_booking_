package com.irctc.TrainExample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="foodorder")
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int foodId;

    private int ticketId;

    private int trainId;

    private int price;

    @ManyToOne
    @JoinColumn
    private Passengers passengers;
}
