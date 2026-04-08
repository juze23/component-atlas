package com.cruz.componentatlas.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "scrape_log")
public class ScrapeLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "component_id")
    private Component component;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "retailer_id", nullable = false)
    private Retailer retailer;

    @Column(length = 500)
    private String url;
 
    @Column(nullable = false, length = 50)
    private String status;  // 'SUCCESS', 'FAILED', 'PARTIAL'

    @Column(name = "error_message", columnDefinition = "TEXT")
    private String errorMessage;
 
    @Column(name = "scraped_at", updatable = false)
    private LocalDateTime scrapedAt;
 
    @PrePersist
    protected void onCreate() {
        scrapedAt = LocalDateTime.now();
    }

    public ScrapeLog() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 
    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
 
    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }
 
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
 
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
 
    public LocalDateTime getScrapedAt() {
        return scrapedAt;
    }
    
}
