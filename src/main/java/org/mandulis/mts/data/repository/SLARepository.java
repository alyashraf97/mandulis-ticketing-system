package org.mandulis.mts.data.repository;

import org.mandulis.mts.data.entity.SLA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SLARepository extends JpaRepository<SLA, Long> {}
