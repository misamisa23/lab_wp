package mk.finki.ukim.mk.lab.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Orders")
public class Order {
    private String pizzaType;
    private String pizzaSize;
    private String clientName;
    private String clientAddress;
    @Id
    private Long orderId;
}
