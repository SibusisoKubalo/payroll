/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Job;
import java.util.List;

public interface JobRepository {
    void save(Job job);
    Job findByTitle(String title);
    List<Job> findAll();
}