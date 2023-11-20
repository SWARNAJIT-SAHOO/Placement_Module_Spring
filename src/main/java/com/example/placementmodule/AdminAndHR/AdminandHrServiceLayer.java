package com.example.placementmodule.AdminAndHR;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminandHrServiceLayer implements AdminandHrInterface{
    private AppliedStudentRepo appliedStudentRepo;

    public AdminandHrServiceLayer(AppliedStudentRepo appliedStudentRepo) {
        this.appliedStudentRepo = appliedStudentRepo;
    }

    public AppliedStudent savedata(AppliedStudent appliedStudent){
        return appliedStudentRepo.save(appliedStudent);
    }
    public List<AppliedStudent> appwho(String cp){
        return appliedStudentRepo.findByCompanyname(cp);
    }

    @Override
    public List<String> cpapplied() {

        return appliedStudentRepo.findDistinctByCompanyname();
    }




}
