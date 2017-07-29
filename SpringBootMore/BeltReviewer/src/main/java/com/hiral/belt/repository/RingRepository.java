package com.hiral.belt.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.belt.models.Ring;

@Repository
public interface RingRepository extends CrudRepository<Ring, Long> {
	@Transactional
	@Modifying
	@Query("delete Ring r WHERE r.id = ?1")
	int deleteOne(Long id);

	@Query(value = "SELECT ri.id, ri.name FROM users u JOIN users_roles ur ON u.id = ur.user_id JOIN roles r ON ur.role_id = r.id JOIN rings ri ON u.id = ri.user_id WHERE r.name='ROLE_ADMIN'", nativeQuery = true)
	List<Object[]> findAdminRings();

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM rings WHERE rings.user_id = ?1", nativeQuery = true)
	int deleteRingByUser(Long id);
}
