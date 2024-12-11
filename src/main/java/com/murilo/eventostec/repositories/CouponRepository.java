package com.murilo.eventostec.repositories;

import com.murilo.eventostec.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
