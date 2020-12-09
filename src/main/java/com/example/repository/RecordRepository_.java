package com.example.repository;

import com.example.model.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public abstract class RecordRepository_ implements JpaRepository<Test, Integer> {
    @Override
    public List<Test> findAll() {
        return null;
    }
}
