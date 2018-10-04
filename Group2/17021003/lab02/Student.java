public class Student {

private String name;
private String id;
private String group;
private String gmail;
public Student (String name, String id, String gmail,String group)
{
this.name = name;
this.id = id;
this.gmail = gmail;
this.group = group;
}

public String getName() {
return this.name;
}
public void setName (String Name){ 
this.name = Name;
}
public String getId (){
return this.id;
}
public void setId(String id){ 
this.id = id;
}
public String getGroup (){
return this.group;
}
public void setGroup(String group){ 
this.group = group;
}
public String getGmail (){
return gmail;
}
public void setGmail(String gmail){ 
this.gmail = gmail;
}
public void getInfo() {
System.out.println (this.getName() + " " + this.getId() + " " + this.getGroup() + " " + this.getGmail());}

public Student()
{
name = "Student";
id= "000";
group = "INT22041";
gmail = "uet@vnu.edu.vn";
}
public Student (String name, String id, String gmail)
{
this.name = name;
this.id = id;
this.group = "INT22041";
this.gmail = gmail;
}
public Student (Student student0)
{
name = student0.getName();
id = student0.getId();
group = student0.getGroup();
gmail = student0.getGmail();
}
}