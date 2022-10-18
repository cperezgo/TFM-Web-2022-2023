package es.uniovi.tfm.epivector.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uniovi.tfm.epivector.repository.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	  Optional<User> findByUsername(String username);

	  Boolean existsByUsername(String username);

}
