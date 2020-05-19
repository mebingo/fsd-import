package com.fsd.repository;

import com.fsd.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {

}

