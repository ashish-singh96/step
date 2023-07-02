package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findAll();

    Job findById(long id);


    List<Job> findByCompanyName(String companyName);


    List<Job> findByJobType(JobType jobType);


    @Query("UPDATE Job SET title = :newTitle WHERE id = :id")
    void updateJobTitleById(@Param("newTitle") String newTitle, @Param("id") long id);


    @Query("DELETE FROM Job WHERE location = :location")
    void deleteByLocation(@Param("location") String location);


    @Query("SELECT j FROM Job j WHERE j.title LIKE %:keyword% OR j.description LIKE %:keyword%")
    List<Job> searchByTitleOrDescription(@Param("keyword") String keyword);
}

