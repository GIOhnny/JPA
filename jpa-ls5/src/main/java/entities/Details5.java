package entities;

import javax.persistence.*;

@Entity
public class Details5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int kcal;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id")
    private Product5 product5;

    public Product5 getProduct5() {
        return product5;
    }

    public void setProduct5(Product5 product) {
        this.product5 = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
