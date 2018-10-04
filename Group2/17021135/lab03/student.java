/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectively;

/**
 *
 * @author Le Quang Vu
 */
public class student {
    private String name ;
	private String school ;
	private String id ;
	public student (String name, String school , String id){
		this.name = name ;
		this.school = school ;
		this.id = id ;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	
}
