package com.cruz.componentatlas.entity;

import jakarta.persistence.Entity;

@Entity
public class GPU extends Component{

    private Integer memoryGb;

    private Integer boostClockMhz;

    private Integer cudaCores;
    
    public GPU() {}

    public Integer getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(Integer memoryGb) {
        this.memoryGb = memoryGb;
    }

    public Integer getBoostClockMhz() {
        return boostClockMhz;
    }

    public void setBoostClockMhz(Integer boostClockMhz) {
        this.boostClockMhz = boostClockMhz;
    }

    public Integer getCudaCores() {
        return cudaCores;
    }

    public void setCudaCores(Integer cudaCores) {
        this.cudaCores = cudaCores;
    }
}
