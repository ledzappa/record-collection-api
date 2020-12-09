package com.collector.repository;

import com.collector.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Test, Integer> {

}
