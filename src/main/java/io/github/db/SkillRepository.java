package io.github.db;

import io.github.db.dto.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends PagingAndSortingRepository<Skill, Integer> {
}

