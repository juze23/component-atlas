package com.cruz.componentatlas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cpu")
@DiscriminatorValue("CPU")
public class CPU extends Component{

    private Integer cores;

    private Integer threads;

    @Column(name = "base_clock_mhz")
    private Integer baseClockMhz;

    @Column(name = "boost_clock_mhz")
    private Integer boostClockMhz;

    @Column(name = "tdp_watts")
    private Integer tdpWatts;       //might not be included

    private String socket;

    private String architecture;

    public CPU() {}

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }
 
    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }
 
    public Integer getBaseClockMhz() {
        return baseClockMhz;
    }

    public void setBaseClockMhz(Integer baseClockMhz) {
        this.baseClockMhz = baseClockMhz;
    }
 
    public Integer getBoostClockMhz() {
        return boostClockMhz;
    }

    public void setBoostClockMhz(Integer boostClockMhz) {
        this.boostClockMhz = boostClockMhz;
    }
 
    public Integer getTdpWatts() {
        return tdpWatts;
    }
    public void setTdpWatts(Integer tdpWatts) {
        this.tdpWatts = tdpWatts;
    }
 
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
 
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) { 
        this.architecture = architecture;
    }
}
