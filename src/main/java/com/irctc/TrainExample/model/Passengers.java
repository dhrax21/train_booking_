package com.irctc.TrainExample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passenger")
public class Passengers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;

    private int trainId;

    private Date date;

    private int age;

    private String gender;

    @ManyToOne
    @JoinColumn(name = "pass_Foren_key")
    private Train train;

//    mappedBy = "passenger",cascade = CascadeType.ALL
    @OneToMany
    @JoinColumn
    private List<FoodOrder> foodOrderList;

}
