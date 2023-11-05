package net.javaguides.mssql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "art")
@Data
public class Articulo {

    @Id
    @Column(name = "co_art", nullable = false)
    private String codArticulo;

    @Column(name = "art_des", nullable = false)
    private String descArticulo;

}
