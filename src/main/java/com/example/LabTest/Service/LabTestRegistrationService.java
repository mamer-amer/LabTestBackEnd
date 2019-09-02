package com.example.LabTest.Service;


import com.example.LabTest.DTO.LabTestRegistrationDTO;
import com.example.LabTest.Model.LabTestRegistration;
import com.example.LabTest.Repository.LabTestRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LabTestRegistrationService {

    @Autowired
    LabTestRegistrationRepository labTestRegistrationRepository;


    public String postLabTest(LabTestRegistrationDTO labtestDTO){


        LabTestRegistration labtest = new LabTestRegistration();
        labtest.setName(labtestDTO.getName());
        labtest.setDetails(labtestDTO.getDetails());
        labtest.setPrice(labtestDTO.getPrice());
        labtest.setCreatedDate(new Date());
        labtest.setCreatedDate(new Date());
        labtest.setStatus("ACTIVE");
        labTestRegistrationRepository.save(labtest);
        return "{\"Labtest added successfully\":1}";
    }


    public List<LabTestRegistration> getLabTest() {
        List<LabTestRegistration> list = labTestRegistrationRepository.findAll();
        List<LabTestRegistration> listFiltered = new ArrayList<>();
        list.forEach(i -> {
            if (i.getStatus().equalsIgnoreCase("ACTIVE")){
                listFiltered.add(i);
            }
        });
        return listFiltered;
    }


    public List<LabTestRegistration> delLabTest(Long id) {
        Optional<LabTestRegistration> labtest = labTestRegistrationRepository.findById(id);
        if (labtest.isPresent()){
            LabTestRegistration lt = labtest.get();
            lt.setStatus("INACTIVE");
            labTestRegistrationRepository.save(lt);
            return getLabTest();
        }
        else {
            String a[] = new String[]{"Not Found"};
            List list = Arrays.asList(a);
            return list;
        }
    }
}
