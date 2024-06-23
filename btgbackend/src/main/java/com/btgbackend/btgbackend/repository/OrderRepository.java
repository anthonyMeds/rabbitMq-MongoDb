package com.btgbackend.btgbackend.repository;

import com.btgbackend.btgbackend.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository  extends MongoRepository<OrderEntity, Long> {
}
