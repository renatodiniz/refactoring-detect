package br.com.ufmg.spring.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by suresh on 17/12/13.
 */
public interface CommitRepository extends CrudRepository<Commit, Integer> {
}
