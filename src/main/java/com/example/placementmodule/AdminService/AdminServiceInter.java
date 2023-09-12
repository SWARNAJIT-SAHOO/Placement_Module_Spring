package com.example.placementmodule.AdminService;

import com.example.placementmodule.AdminData;

import java.util.List;

public interface AdminServiceInter {
    AdminData saveAdminData(AdminData adminData);
    List<AdminData> getAdminDataList();
    AdminData updateAdminData(String name,AdminData adminData);

    void deletecompany(String name);
}
