package org.zerock.j1test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j1test.domain.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {
    
}
