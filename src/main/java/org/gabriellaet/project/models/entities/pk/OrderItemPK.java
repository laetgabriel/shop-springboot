package org.gabriellaet.project.models.entities.pk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.gabriellaet.project.models.entities.Order;
import org.gabriellaet.project.models.entities.Product;

import java.io.Serial;
import java.io.Serializable;

@Data
@Embeddable
public class OrderItemPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;



}
