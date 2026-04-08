package com.cruz.componentatlas.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "component_price")
public class ComponentPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "component_id", nullable = false)
    private Component component;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "retailer_id", nullable = false)
    private Retailer retailer;
 
    @Column(nullable = false)
    private BigDecimal price;
 
    @Column(length = 10)
    private String currency = "EUR";

    @Column(length = 500)
    private String url;
 
    @Column(name = "is_current")
    private Boolean isCurrent = false;
 
    @Column(name = "scraped_at", updatable = false)
    private LocalDateTime scrapedAt;
 
    @PrePersist
    protected void onCreate() {
        scrapedAt = LocalDateTime.now();
    }

    public ComponentPrice() {}

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
 
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
 
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
 
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
 
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
 
    public LocalDateTime getScrapedAt() {
        return scrapedAt;
    }
    
}
