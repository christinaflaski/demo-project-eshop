package com.cflaski.eshop.model;

import com.cflaski.eshop.core.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "users")
public class User extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String uuid;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    private String password;

    @Column(unique = true)
    private String email;

    @ColumnDefault("true")
    private boolean isActive;

    @Column(unique = true)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @PrePersist
    public void initUuid() {
        if (uuid == null) uuid = UUID.randomUUID().toString();
    }

    @OneToMany(mappedBy = "user")
    private Set<Order> orders = new HashSet<>();

    public Set<Order> getAllOrders() {
        if(orders == null) {
            orders = new HashSet<>();
        }
        return Collections.unmodifiableSet(orders);
    }

    public void addOrder(Order order) {
        if (orders == null) {
            orders = new HashSet<>();
        }
        orders.add(order);
        order.setUser(this);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
        if (order != null) {
            order.setUser(null);
        }
    }


    public boolean hasOrders(){
        return orders != null && !orders.isEmpty();
    }

}
