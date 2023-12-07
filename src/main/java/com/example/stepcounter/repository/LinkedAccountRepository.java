package com.example.stepcounter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.example.stepcounter.model.LinkedAccount;

import jakarta.transaction.Transactional;

@Repository
public interface LinkedAccountRepository extends JpaRepository<LinkedAccount, Integer> {
	public LinkedAccount getById(String id);
	@Modifying
	@Transactional
	void deleteByUserId(int id);
}
