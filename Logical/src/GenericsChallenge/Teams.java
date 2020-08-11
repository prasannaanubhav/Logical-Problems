package GenericsChallenge;

public abstract class Teams {

	private String name;
	private String manager;

	public Teams(String name, String manager) {
		this.name = name;
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Team name= " + name + ", manager= " + manager;
	}

	
}
