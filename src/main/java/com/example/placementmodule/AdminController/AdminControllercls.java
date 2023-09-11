package com.example.placementmodule.AdminController;

import com.example.placementmodule.AdminData;
import com.example.placementmodule.AdminService.AdminServicecls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AdminControllercls {
    private AdminServicecls adminServicecls;

    @Autowired
    public AdminControllercls(AdminServicecls adminServicecls) {
        this.adminServicecls = adminServicecls;
    }

    @PostMapping("/admin/register")
    public AdminData saveAdmindata(@RequestBody AdminData adminData){
        return this.adminServicecls.saveAdminData(adminData);
    }
    @GetMapping("/admin/data")
    public List<AdminData> getAdminData(){
        return adminServicecls.getAdminDataList();
    }

    @PutMapping("/admin/update/{companyname}")
    public ResponseEntity<AdminData> updatedata(@PathVariable("companyname")String companyname,@RequestBody AdminData adminData){
        return new ResponseEntity<AdminData>(adminServicecls.updateAdminData(companyname,adminData), HttpStatus.OK);
    }
}
