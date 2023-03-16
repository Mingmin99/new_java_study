package com.day_0316.instance;

import java.util.Objects;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Student(int i, String name) {
	super();
	this.name = name;
}

//@Override
//public String toString() {
//	return "Student [name=" + name + "]";
//}

@Override
public int hashCode() {
	return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(name, other.name);
}

}
