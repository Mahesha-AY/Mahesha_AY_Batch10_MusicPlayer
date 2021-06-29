package com.te.cs.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = " MusicFiles")
public class Song implements Serializable {
	
	private int song_Id;
	private String song_Title;
	private String artist_name;
	private String album_Name;
	private String song_Location;
	private String description;

}
