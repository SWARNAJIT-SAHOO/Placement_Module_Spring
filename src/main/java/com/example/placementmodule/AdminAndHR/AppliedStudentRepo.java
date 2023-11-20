package com.example.placementmodule.AdminAndHR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AppliedStudentRepo extends JpaRepository<AppliedStudent,Long> {

    List<AppliedStudent> findByCompanyname(String cp);
    @Query(value = "SELECT DISTINCT companyname FROM studentapplied", nativeQuery = true)
    List<String > findDistinctByCompanyname();
}
