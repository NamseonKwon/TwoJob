package com.blocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blocker.dto.Member;

public interface WalletRepository extends JpaRepository<Member, String>{

}
