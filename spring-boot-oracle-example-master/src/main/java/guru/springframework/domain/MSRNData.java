package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
@Entity
public class MSRNData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Size (min=2, message="Name should have atleast 2 characters")
    private String description;
    private BigDecimal price;
    private String imageUrl;
    
    @Transient
    String status = "";
    
    
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
