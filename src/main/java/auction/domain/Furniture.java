package auction.domain;

import javax.persistence.Entity;

@Entity
public class Furniture extends Item {
    private String material;

    public Furniture(String material, User seller, Category category, String description) {
        super(seller, category, description);
        this.material = material;
    }
}
