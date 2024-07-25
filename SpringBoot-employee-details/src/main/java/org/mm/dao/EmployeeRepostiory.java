package org.mm.dao;

import org.mm.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepostiory extends JpaRepository<EmployeeEntity, Long> 
{

}
