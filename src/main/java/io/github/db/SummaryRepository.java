package io.github.db;

import io.github.db.dto.Summary;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SummaryRepository extends PagingAndSortingRepository<Summary, Integer> {
}
