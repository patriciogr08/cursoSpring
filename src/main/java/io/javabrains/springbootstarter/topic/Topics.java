package io.javabrains.springbootstarter.topic;

public class Topics {

	 private String Id;
	 private String Name;

	private String description;
	
	public Topics(String id, String name, String description) {
		super();
		Id = id;
		Name = name;
		this.description = description;
	}
	
	public Topics() {}
	
	
	 public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
