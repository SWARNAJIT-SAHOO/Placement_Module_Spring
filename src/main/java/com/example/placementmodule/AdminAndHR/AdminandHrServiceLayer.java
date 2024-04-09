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

    public List<String> cansee(String email){
        return appliedStudentRepo.findDistinctCompanyNamesByEmail(email);
    }

    @Override
    public List<AppliedStudent> searchall(String name) {
        List<AppliedStudent> ap= appliedStudentRepo.findByCompanynameContaining(name);
        if(ap.isEmpty()){
            ap = appliedStudentRepo.findByFirsnameContaining(name);
        }
        return ap;
    }
    public List<AppliedStudent> searchallnot() {
        return appliedStudentRepo.findAll();
    }
    @Override
    public List<AppliedStudent> searchname(String name) {
        return appliedStudentRepo.findByFirsnameContaining(name);
    }

}
