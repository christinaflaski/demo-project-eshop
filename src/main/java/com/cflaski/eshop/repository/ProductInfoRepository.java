package com.cflaski.eshop.repository;


import com.cflaski.eshop.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Long> {
    List<ProductInfo> findByProductId(Long id);
}
