package io.github.rest;

import io.github.db.ExperienceRepository;
import io.github.db.SkillRepository;
import io.github.db.SummaryRepository;
import io.github.db.dto.Experience;
import io.github.db.dto.Skill;
import io.github.db.dto.Summary;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@RestController
@RequestMapping("/api/")
public class ApiController {

	private final ExperienceRepository experienceRepository;
	private final SkillRepository skillRepository;
	private final SummaryRepository summaryRepository;
	private static final String SORT_PROPERTY = "id";


	@GetMapping("companies")
	public List<Experience> getAllTasks() {
		return getList(experienceRepository.findAll(Sort.by("startDate").descending()));
	}

	@GetMapping("skills")
	public List<Skill> getAllSkills() {
		return getList(skillRepository.findAll(Sort.by(SORT_PROPERTY)));
	}

	@GetMapping("summary")
	public List<Summary> getSummaries() {
		return getList(summaryRepository.findAll(Sort.by(SORT_PROPERTY)));
	}

	private <T> List<T> getList(Iterable<T> repo) {
		return StreamSupport.stream(repo.spliterator(), false).collect(Collectors.toList());
	}
}
