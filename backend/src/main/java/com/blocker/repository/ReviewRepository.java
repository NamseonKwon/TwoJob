package com.blocker.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blocker.dto.ReviewDto;

public interface ReviewRepository extends JpaRepository<ReviewDto, String> {
	@Query(value = "select * from review where saleaddress =:saleaddress", countQuery = "select count(*) from review where saleaddress =:saleaddress", nativeQuery = true)
	List<ReviewDto> findAllBySaleaddress(Pageable page, String saleaddress);
}