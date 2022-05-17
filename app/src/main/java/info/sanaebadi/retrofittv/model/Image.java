package info.sanaebadi.retrofittv.model;

import com.google.gson.annotations.SerializedName;

public class Image{


	@SerializedName("original")
	private String original;

	@SerializedName("medium")
	private String medium;

	public String getOriginal(){
		return original;
	}

	public String getMedium(){
		return medium;
	}
}