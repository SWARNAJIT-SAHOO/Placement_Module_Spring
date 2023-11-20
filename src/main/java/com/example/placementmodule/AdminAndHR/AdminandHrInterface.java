package com.example.placementmodule.AdminAndHR;

import java.util.List;
import java.util.Optional;

public interface AdminandHrInterface {
    AppliedStudent savedata(AppliedStudent appliedStudent);
    List<AppliedStudent> appwho(String cp);
    List<String> cpapplied();
}
