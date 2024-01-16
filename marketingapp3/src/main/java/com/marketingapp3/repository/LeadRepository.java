package com.marketingapp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp3.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
