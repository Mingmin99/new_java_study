package com.day_0316.instance.clone.exam1;

import java.util.Date;
import java.util.Objects;

public class Book implements Cloneable, Comparable {
	private String title;
	private Date publishData;
	private String comment;

	public Book(String title, Date publishData, String comment) {
		this.title = title;
		this.publishData = publishData;
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishData() {
		return publishData;
	}

	public void setPublishData(Date publishData) {
		this.publishData = publishData;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishData, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(publishData, other.publishData) && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book book) {
		return this.publishData.compareTo(book.publishData);
	}

	@Override
	public Book Clone() {
		Book result = new Book(title, publishData, comment);
		result.title = this.title;
		result.publishData = this.publishData;
		result.comment = this.comment;
		return result;
	}
}
