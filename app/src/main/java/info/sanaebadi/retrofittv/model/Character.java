package info.sanaebadi.retrofittv.model;

import com.google.gson.annotations.SerializedName;

public class Character{

	@SerializedName("image")
	private Image image;

	@SerializedName("_links")
	private Links links;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("url")
	private String url;

	public Image getImage(){
		return image;
	}

	public Links getLinks(){
		return links;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}
}