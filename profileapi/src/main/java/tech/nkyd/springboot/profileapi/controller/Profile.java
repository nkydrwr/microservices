package tech.nkyd.springboot.profileapi.controller;

public class Profile {

    private String id;

    private String name;

    private String email;


    public Profile() {
    }

    public Profile(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
