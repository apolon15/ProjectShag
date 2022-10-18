package com.example.cocktailsMaker.demo.models;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "alcohole_id")
    private Alcohole alcohole;
    @ManyToOne
    @JoinColumn(name = "zapivon_id")
    private Zapivon zapivon;
    @ManyToOne
    @JoinColumn(name = "siropy_id")
    private Siropy siropy;
}
