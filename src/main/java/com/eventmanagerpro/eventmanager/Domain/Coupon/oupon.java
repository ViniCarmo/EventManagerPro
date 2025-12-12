package com.eventmanagerpro.eventmanager.Domain.Coupon;

import com.eventmanagerpro.eventmanager.Domain.Events;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class oupon {
    @Id
    @GeneratedValue
    private UUID id;
    private String code;
    private Double discount;
    private Date expirationDate;

    @ManyToOne
    @JoinColumn(name = "events_id")
    private Events events;


}
