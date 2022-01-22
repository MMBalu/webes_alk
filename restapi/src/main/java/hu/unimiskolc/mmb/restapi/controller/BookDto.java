package hu.unimiskolc.mmb.restapi.controller;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookDto {
	
	private Long id;
	@NotBlank
	@Size(min=3)
	private String name;
	@NotNull
	@Min(1)
	private Long price;

	
	@Override
	public String toString() {
		return "BookDto [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	
	
	
}
