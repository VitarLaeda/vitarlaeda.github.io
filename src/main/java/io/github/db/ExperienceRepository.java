package io.github.db;

import io.github.db.dto.Experience;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends PagingAndSortingRepository<Experience, Integer> {
}
