package com.ecommerce.project.repositories;

import com.ecommerce.project.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("Select coalesce(sum(o.totalAmount), 0) from Order o")
    Double getTotalRevenue();
}
