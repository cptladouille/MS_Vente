package org.cnam.MS_Vente.repository;

import org.cnam.MS_Vente.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {

}
