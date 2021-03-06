package javaBeansExample;

import java.io.Serializable;

public class PetBean implements Serializable {

	private String breed;
	private String color;
	private String owner;
	
	public PetBean() {
		
	}
	
	public PetBean(String breed, String color, String owner) {
		
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// auto-generated by eclipse
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	// auto-generated by eclipse
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetBean other = (PetBean) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
	
}