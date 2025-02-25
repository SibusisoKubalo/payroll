package za.ac.cput.repository;

import za.ac.cput.entity.Job;
import java.util.List;

public interface JobRepository {
    void save(Job job);
    List<Job> findAll();
}
