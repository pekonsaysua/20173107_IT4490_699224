package com.oms.components.abstractdata.controller;

import java.util.ArrayList;
import java.util.Map;

import com.oms.bean.Book;
import com.oms.bean.CompactDisc;
import com.oms.bean.DigitalVideoDisc;
import com.oms.bean.Media;


public interface IMediaApi {
	public ArrayList<Media> getAllMedias();
	
	//public ArrayList<Media> getMedias(Map<String, String> queryParams);
	//public Media updateMedia(Media media);
	
	public ArrayList<Book> getBooks(Map<String, String> queryParams);
	public Book updateBook(Book book);
	public ArrayList<CompactDisc> getCds(Map<String, String> queryParams);
	public ArrayList<DigitalVideoDisc> getDvds(Map<String, String> queryParams);
}
