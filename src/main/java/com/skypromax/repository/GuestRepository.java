package com.skypromax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skypromax.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest,Long> {

}
