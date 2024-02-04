package ru.geekbrains.SpringHomeWork6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.SpringHomeWork6.entity.Executor;

@Repository
public interface ExecutorRepository extends JpaRepository<Executor, Long> {
}