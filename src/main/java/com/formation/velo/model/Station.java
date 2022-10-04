package com.formation.velo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "Stations")
public class Station implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message = "lattitude is mandatory")
    private double lattitude;

    @NotBlank(message = "longitude is mandatory")
    private double longitude;

    @NotBlank(message = "status is mandatory")
    private String status;

    @NotBlank(message = "bike_stands")
    private int bike_stands;

    @NotBlank(message = "available_bikes is mandatory")
    private int available_bikes;

    @NotBlank(message = "available_bike_stands is mandatory")
    private int available_bike_stands;

    @NotBlank(message = "recordid is mandatory")
    private String recordid;

    @NotBlank(message = "adresse is mandatory")
    private String adresse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return Double.compare(station.lattitude, lattitude) == 0 && Double.compare(station.longitude, longitude) == 0 && bike_stands == station.bike_stands && available_bikes == station.available_bikes && available_bike_stands == station.available_bike_stands && Objects.equals(id, station.id) && Objects.equals(name, station.name) && Objects.equals(status, station.status) && Objects.equals(recordid, station.recordid) && Objects.equals(adresse, station.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lattitude, longitude, status, bike_stands, available_bikes, available_bike_stands, recordid, adresse);
    }
}
