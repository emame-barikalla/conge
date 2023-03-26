package com.portailRH.Role.Repository;

import com.portailRH.Role.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
