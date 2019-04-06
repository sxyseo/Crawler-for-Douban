package tango.crawler.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tango.crawler.entity.Movie;

/**
 * Created by TANQX3 on 2017-3-22.
 */
@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer> {
    Movie findBySubjectId(String subjectId);
}
