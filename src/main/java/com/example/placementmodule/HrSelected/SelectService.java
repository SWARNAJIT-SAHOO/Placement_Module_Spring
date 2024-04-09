package com.example.placementmodule.HrSelected;

import com.example.placementmodule.AdminAndHR.AppliedStudent;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectService {

    private SelectedStudentRepository selectedStudentRepository;

    public SelectService(SelectedStudentRepository selectedStudentRepository) {
        this.selectedStudentRepository = selectedStudentRepository;
    }

public void tosaveslected(List<Selectedstudents> selectedstudents){
        selectedStudentRepository.saveAll(selectedstudents);
}

public List<Selectedstudents> getallselected(){
        return selectedStudentRepository.findAll();
}

    public void getTable(HttpServletResponse response) {
        try {
            response.setContentType("text/csv");
            response.setHeader("Content-Disposition", "attachment; filename=\"table.csv\"");

            StatefulBeanToCsv<Selectedstudents> writer = new StatefulBeanToCsvBuilder<Selectedstudents>(response.getWriter()).build();
            List<Selectedstudents> tableData = selectedStudentRepository.findAll();

            writer.write(tableData);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to export table data to CSV", ex);
        }
    }
}
