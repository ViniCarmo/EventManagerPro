package com.eventmanagerpro.eventmanager.Repositories;

import com.eventmanagerpro.eventmanager.Domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
