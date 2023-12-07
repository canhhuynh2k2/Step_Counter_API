package com.example.stepcounter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.example.stepcounter.model.DeviceAccount;

import jakarta.transaction.Transactional;

@Repository
public interface DeviceAccountRepository extends JpaRepository<DeviceAccount, Integer>{
	public DeviceAccount getById(String deviceId);
	@Modifying
	@Transactional
	void deleteByUserId(int id);
}
