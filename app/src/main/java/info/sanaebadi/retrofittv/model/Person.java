package info.sanaebadi.retrofittv.model;

import com.google.gson.annotations.SerializedName;

public class Person{

	@SerializedName("birthday")
	private String birthday;
	@SerializedName("country")
	private Country country;
	@SerializedName("image")
	private Image image;
	@SerializedName("gender")
	private String gender;
	@SerializedName("_links")
	private Links links;
	@SerializedName("name")
	private String name;
	@SerializedName("id")
	private int id;
	@SerializedName("deathday")
	private Object deathday;
	@SerializedName("updated")
	private int updated;
	@SerializedName("url")
	private String url;

	public String getBirthday(){
		return birthday;
	}

	public Country getCountry(){
		return country;
	}

	public Image getImage(){
		return image;
	}

	public String getGender(){
		return gender;
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

	public Object getDeathday(){
		return deathday;
	}

	public int getUpdated(){
		return updated;
	}

	public String getUrl(){
		return url;
	}
}