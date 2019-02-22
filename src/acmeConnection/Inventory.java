package acmeConnection;
// Generated Feb 22, 2019 8:33:54 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Inventory generated by hbm2java
 */
public class Inventory  implements java.io.Serializable {


     private Integer invId;
     private String invName;
     private String invDescription;
     private String invImage;
     private String invThumbnail;
     private BigDecimal invPrice;
     private short invStock;
     private short invSize;
     private short invWeight;
     private String invLocation;
     private int categoryId;
     private String invVendor;
     private String invStyle;
     private Boolean invFeatured;
     private Set reviewses = new HashSet(0);
     private Set imageses = new HashSet(0);

    public Inventory() {
    }

	
    public Inventory(String invName, String invDescription, String invImage, String invThumbnail, BigDecimal invPrice, short invStock, short invSize, short invWeight, String invLocation, int categoryId, String invVendor, String invStyle) {
        this.invName = invName;
        this.invDescription = invDescription;
        this.invImage = invImage;
        this.invThumbnail = invThumbnail;
        this.invPrice = invPrice;
        this.invStock = invStock;
        this.invSize = invSize;
        this.invWeight = invWeight;
        this.invLocation = invLocation;
        this.categoryId = categoryId;
        this.invVendor = invVendor;
        this.invStyle = invStyle;
    }
    public Inventory(String invName, String invDescription, String invImage, String invThumbnail, BigDecimal invPrice, short invStock, short invSize, short invWeight, String invLocation, int categoryId, String invVendor, String invStyle, Boolean invFeatured, Set reviewses, Set imageses) {
       this.invName = invName;
       this.invDescription = invDescription;
       this.invImage = invImage;
       this.invThumbnail = invThumbnail;
       this.invPrice = invPrice;
       this.invStock = invStock;
       this.invSize = invSize;
       this.invWeight = invWeight;
       this.invLocation = invLocation;
       this.categoryId = categoryId;
       this.invVendor = invVendor;
       this.invStyle = invStyle;
       this.invFeatured = invFeatured;
       this.reviewses = reviewses;
       this.imageses = imageses;
    }
   
    public Integer getInvId() {
        return this.invId;
    }
    
    public void setInvId(Integer invId) {
        this.invId = invId;
    }
    public String getInvName() {
        return this.invName;
    }
    
    public void setInvName(String invName) {
        this.invName = invName;
    }
    public String getInvDescription() {
        return this.invDescription;
    }
    
    public void setInvDescription(String invDescription) {
        this.invDescription = invDescription;
    }
    public String getInvImage() {
        return this.invImage;
    }
    
    public void setInvImage(String invImage) {
        this.invImage = invImage;
    }
    public String getInvThumbnail() {
        return this.invThumbnail;
    }
    
    public void setInvThumbnail(String invThumbnail) {
        this.invThumbnail = invThumbnail;
    }
    public BigDecimal getInvPrice() {
        return this.invPrice;
    }
    
    public void setInvPrice(BigDecimal invPrice) {
        this.invPrice = invPrice;
    }
    public short getInvStock() {
        return this.invStock;
    }
    
    public void setInvStock(short invStock) {
        this.invStock = invStock;
    }
    public short getInvSize() {
        return this.invSize;
    }
    
    public void setInvSize(short invSize) {
        this.invSize = invSize;
    }
    public short getInvWeight() {
        return this.invWeight;
    }
    
    public void setInvWeight(short invWeight) {
        this.invWeight = invWeight;
    }
    public String getInvLocation() {
        return this.invLocation;
    }
    
    public void setInvLocation(String invLocation) {
        this.invLocation = invLocation;
    }
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getInvVendor() {
        return this.invVendor;
    }
    
    public void setInvVendor(String invVendor) {
        this.invVendor = invVendor;
    }
    public String getInvStyle() {
        return this.invStyle;
    }
    
    public void setInvStyle(String invStyle) {
        this.invStyle = invStyle;
    }
    public Boolean getInvFeatured() {
        return this.invFeatured;
    }
    
    public void setInvFeatured(Boolean invFeatured) {
        this.invFeatured = invFeatured;
    }
    public Set getReviewses() {
        return this.reviewses;
    }
    
    public void setReviewses(Set reviewses) {
        this.reviewses = reviewses;
    }
    public Set getImageses() {
        return this.imageses;
    }
    
    public void setImageses(Set imageses) {
        this.imageses = imageses;
    }




}


