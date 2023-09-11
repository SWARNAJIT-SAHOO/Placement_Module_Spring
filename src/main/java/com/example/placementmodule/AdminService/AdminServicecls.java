package com.example.placementmodule.AdminService;

import com.example.placementmodule.AdminData;
import com.example.placementmodule.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServicecls implements AdminServiceInter{
    private AdminRepository adminRepository;
    @Autowired
    public AdminServicecls(@Lazy AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminData saveAdminData(AdminData adminData) {
        return adminRepository.save(adminData);
    }

    @Override
    public List<AdminData> getAdminDataList() {

        return adminRepository.findAll();
    }

    @Override
    public AdminData updateAdminData(String name,AdminData adminData) {
//        Optional<AdminData> ad = adminRepository.findBy();

        return null;
    }


}
