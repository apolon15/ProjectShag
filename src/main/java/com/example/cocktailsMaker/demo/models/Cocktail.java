package com.example.cocktailsMaker.demo.models;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private String structure;
    private String description;
    private String link;


//    @ManyToOne
//    @JoinColumn(name = "strong_drink_id")
//    private StrongDrink strongDrink;
//
//    @ManyToOne
//    @JoinColumn(name = "light_drink_id")
//    private LightDrink lightDrink;
//
//    @ManyToOne
//    @JoinColumn(name = "midle_drink_id")
//    private MidleDrink midleDrink;

}