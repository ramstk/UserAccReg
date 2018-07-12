/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserRegistration;

/**
 * @author RAM
 *
 */
@Repository
public interface UserRegRepo extends JpaRepository<UserRegistration, Long> {

}
