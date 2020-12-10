package com.kesti.work_2020.test.test_api4.Controller;

import java.util.Optional;

import com.kesti.work_2020.test.test_api4.Entity.tc_model_change_record;
import com.kesti.work_2020.test.test_api4.repository.tc_model_change_recordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;

@RestController
@RequestMapping(value = "/tc_model_change_record")
public class Tc_model_change_recordController {
    private tc_model_change_recordRepository tc_model_change_recordRep;

    @Autowired
    public Tc_model_change_recordController(tc_model_change_recordRepository tc_model_change_recordRep) {
        this.tc_model_change_recordRep = tc_model_change_recordRep;
    }
    //테이블 리스트 가져오기 
    @GetMapping
    public Iterable<tc_model_change_record> list(){
        return tc_model_change_recordRep.findAll();
    }
    //id로 테이블 값 가져오기
    @GetMapping(value = "/{num}")
    public Optional<tc_model_change_record> findOne(@PathVariable Integer num) {
        return tc_model_change_recordRep.findById(num);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }
}