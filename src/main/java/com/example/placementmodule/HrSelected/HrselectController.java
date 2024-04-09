package com.example.placementmodule.HrSelected;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
public class HrselectController {
    private SelectService selectService;

    public HrselectController(SelectService selectService) {
        this.selectService = selectService;
    }
@PostMapping("/selected/save")
    public void savedata(@RequestBody List<Selectedstudents>selectedstudents){
        selectService.tosaveslected(selectedstudents);
    }
    @GetMapping("/selected/getall")
    public List<Selectedstudents> getall(){
        return selectService.getallselected();
    }
    @GetMapping(value = "/table/allselected/csv")
    public void getadminTableAsCsv(HttpServletResponse response){
        selectService.getTable(response);
    }

}
