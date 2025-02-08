package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Orders;
import com.example.demo.Entity.User;

public interface OrdersRepo extends JpaRepository<Orders, String> {

	List<Orders> findByUser(User user);
}
