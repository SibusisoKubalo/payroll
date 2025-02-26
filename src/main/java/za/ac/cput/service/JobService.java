/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.service;

import za.ac.cput.domain.Job;
import za.ac.cput.repository.JobRepository;
import java.util.List;

public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public void addJob(Job job) {
        jobRepository.save(job);
    }

    public Job getJobByTitle(String title) {
        return jobRepository.findByTitle(title);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}