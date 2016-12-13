package auction.domain;

import com.sun.istack.internal.NotNull;
import nl.fontys.util.FontysTime;
import nl.fontys.util.Money;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Bid implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private FontysTime time;
    private User buyer;
    private Money amount;
    @OneToOne
    @NotNull
    private Item item;

    public Bid(User buyer, Money amount, Item item) {
        this.buyer = buyer;
        this.amount = amount;
        this.item = item;
    }

    public Bid() {}

    public Long getId() {
        return id;
    }

    public FontysTime getTime() {
        return time;
    }

    public User getBuyer() {
        return buyer;
    }

    public Money getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Bid)) return false;
        Bid b2 = (Bid)o;
        if(b2.getId() == this.getId()) return true;
        return false;
    }
}
