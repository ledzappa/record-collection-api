package com.example.repository;

import com.example.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Test, Integer> {

}
