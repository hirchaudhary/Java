package com.hiral.lookify.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hiral.lookify.models.Songs;

@Repository
public interface LookifyRepository extends CrudRepository<Songs, Long>{
	List<Songs> findByArtistContaining(String artist);
	List<Songs> findTop10ByOrderByRatingDesc();
}
