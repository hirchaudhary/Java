package com.hiral.dojos.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hiral.dojos.models.Dojo;

@Repository
public interface DojoRepository extends PagingAndSortingRepository<Dojo, Long> {
	@Query("SELECT d FROM Dojo d")
	List<Dojo> findAllDojos();

	@Query("SELECT d FROM Dojo d WHERE id = ?1")
	List<Dojo> getDojoWhereId(long id);

	@Modifying
	@Transactional
	@Query("UPDATE Dojo d set d.name = ?1 WHERE d.id = ?2")
	int setNameForOne(String name, long id);

	@Modifying
	@Transactional
	@Query("delete Dojo d WHERE d.id = ?1")
	int deleteOneDojo(long id);

	@Query(value = "SELECT id, name from dojo", nativeQuery = true)
	List<Object[]> findAllDojosNamesWithId2();

}
