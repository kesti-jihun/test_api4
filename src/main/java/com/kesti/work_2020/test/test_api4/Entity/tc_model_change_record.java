package com.kesti.work_2020.test.test_api4.Entity;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class tc_model_change_record {
    @Id @GeneratedValue
    private Integer num;
    private String anal_time;
    private String model_nm;
    private String change_log;
    public tc_model_change_record() {
    }
    public tc_model_change_record(String anal_time, String model_nm, String change_log) {
        this.anal_time = anal_time;
        this.model_nm = model_nm;
        this.change_log = change_log;
    }
}
