package es.uniovi.tfm.epivector.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uniovi.tfm.epivector.repository.model.Role;
import es.uniovi.tfm.epivector.repository.model.RolesEnum;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	  Optional<Role> findByName(RolesEnum name);

}
