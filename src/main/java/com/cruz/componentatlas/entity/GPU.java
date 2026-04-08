package com.cruz.componentatlas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "gpu")
@DiscriminatorValue("GPU")
public class GPU extends Component{

    @Column(name = "memory_gb")
    private Integer memoryGb;

    @Column(name = "memory_type")
    private String memoryType;

    @Column(name = "boost_clock_mhz")
    private Integer boostClockMhz;

    @Column(name = "cuda_cores")
    private Integer cudaCores;

    @Column(name = "tdp_watts")
    private Integer tdpWatts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturer_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "components"})
    private Manufacturer manufacturer;

    private String architecture;
    
    public GPU() {}

    public Integer getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(Integer memoryGb) {
        this.memoryGb = memoryGb;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
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

    public Integer getTdpWatts() {
        return tdpWatts;
    }

    public void setTdpWatts(Integer tdpWatts) {
        this.tdpWatts = tdpWatts;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
}
