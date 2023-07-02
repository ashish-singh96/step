package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobRepository jobRepository;

    @Autowired
    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @PostMapping
    public Job createJob(@Valid @RequestBody Job job) {
        return jobRepository.save(job);
    }


    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable("id") Long id) {
        return jobRepository.findById(id).orElse(null);
    }


    @PutMapping("/{id}")
    public Job updateJob(@PathVariable("id") Long id, @Valid @RequestBody Job updatedJob) {
        Job existingJob = jobRepository.findById(id).orElse(null);
        if (existingJob != null) {
            existingJob.setTitle(updatedJob.getTitle());
            existingJob.setDescription(updatedJob.getDescription());
            existingJob.setLocation(updatedJob.getLocation());
            existingJob.setSalary(updatedJob.getSalary());
            existingJob.setCompanyEmail(updatedJob.getCompanyEmail());
            existingJob.setCompanyName(updatedJob.getCompanyName());
            existingJob.setEmployerName(updatedJob.getEmployerName());
            existingJob.setJobType(updatedJob.getJobType());
            existingJob.setAppliedDate(updatedJob.getAppliedDate());

            return jobRepository.save(existingJob);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable("id") Long id) {
        jobRepository.deleteById(id);
    }
}
