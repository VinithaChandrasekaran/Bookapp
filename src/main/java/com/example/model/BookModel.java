package com.example.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class BookModel
{
@Id
@Column(name = "isbn")
private long isbn;
@Column(name = "booktitle")
private String title;
@Column(name = "bookauthor")
private String author;
@Column(name = "published_date")
private String publishDate;
@Column(name = "content")
private String content;
@Column(name = "price")
private double price;
@Column(name = "status")
private String status;

public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublishDate() {
	return publishDate;
}
public void setPublishDate(String publishDate) {
	this.publishDate = publishDate;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}




