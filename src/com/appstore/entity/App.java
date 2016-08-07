package com.appstore.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity // define a Entity??? claim that this class is initialed with hibernate
//need define in hibernate setting
@Table(name="app_info") //need import javax.persistence.Table. if the class name is same with table in DB, this can be deleted.
public class App {
// this App class is used to describe the basic intro. of apps.
	private String appid;
	private int score;
	private String title;
	private String url;
	private String thumbnail_url;
	private String intro;
	private String developer;
	private String top5App;
	
	//put the database into class through get/set method, not constructor
	//hibernate connect sql will come error, hibernate need empty variable constructor
	
	@Id //set the Id. getAppid -> appid to search id in DB.
	//field appid is inrelevant, can change any names
	// why id is special?
	public String getAppid() {
		return appid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail_url() {
		return thumbnail_url;
	}

	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getTop5App() {
		return top5App;
	}

	public void setTop5App(String top5App) {
		this.top5App = top5App;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}
}
