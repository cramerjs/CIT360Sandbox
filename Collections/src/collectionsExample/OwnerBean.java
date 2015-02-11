package collectionsExample;

import java.io.Serializable;

public class OwnerBean implements Serializable {
	
	private String ownerName;
	private String ownerUsername;
	private Continent continent;
	private boolean premiumUser;	

		protected enum Continent {
			
			AFRICA, ASIA, EUROPE, OCEANIA, NORTHAMERICA, SOUTHAMERICA, ANTARCTICA
			
		}
	
	public OwnerBean() {
		
	}
	
	public OwnerBean(String OwnerName, String ownerUsername, String continent, boolean premiumUser) {
		
	}

	// ALL BELOW auto generated by Eclipse
	
	public String getOwnerName() {
		return ownerName;
	}

	public String getOwnerUsername() {
		return ownerUsername;
	}

	public Continent getContinent() {
		return continent;
	}

	public boolean isPremiumUser() {
		return premiumUser;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public void setPremiumUser(boolean premiumUser) {
		this.premiumUser = premiumUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((continent == null) ? 0 : continent.hashCode());
		result = prime * result
				+ ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result
				+ ((ownerUsername == null) ? 0 : ownerUsername.hashCode());
		result = prime * result + (premiumUser ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof OwnerBean))
			return false;
		OwnerBean other = (OwnerBean) obj;
		if (continent != other.continent)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (ownerUsername == null) {
			if (other.ownerUsername != null)
				return false;
		} else if (!ownerUsername.equals(other.ownerUsername))
			return false;
		if (premiumUser != other.premiumUser)
			return false;
		return true;
	}
	
}