package com.ecom.login.dao;

import com.ecom.login.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddessDao extends JpaRepository<Address, Long> {
}
