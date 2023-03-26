package com.portailRH.Role.Service;

import com.portailRH.Role.Entity.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    List<Role> findAllRoles();
    Optional<Role> findById(Long id);
    Role saverole(Role role);
    Role updaterole(Role role);
    void deleterole(Long id);
}
