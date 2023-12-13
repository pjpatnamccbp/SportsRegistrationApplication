package com.govt.registerservice.dao;

import com.govt.registerservice.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@Repository
public interface IRegistrationRepository extends JpaRepository<Registration,String> {
}
