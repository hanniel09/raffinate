package org.avs.raffinate.domain.clothes;


import jakarta.persistence.*;
import org.avs.raffinate.DTO.clothes.ClothesDTO;

@Entity
@Table
public class Clothes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column()
    private String name;

    @Column()
    private String type;

    @Column()
    private Double price;

    public Clothes() {
    }

    public Clothes(String name, String type, Double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Clothes(ClothesDTO data) {
        this.name = data.name();
        this.type = data.type();
        this.price = data.price();
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
