package com.eventmanagerpro.eventmanager.Repositories;

import com.eventmanagerpro.eventmanager.Domain.Coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Couponrepository extends JpaRepository<Coupon, UUID> {
}
