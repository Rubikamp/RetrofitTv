package info.sanaebadi.retrofittv.model;

import com.google.gson.annotations.SerializedName;

public class Country{


	@SerializedName("code")
	private String code;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("name")
	private String name;

	public String getCode(){
		return code;
	}

	public String getTimezone(){
		return timezone;
	}

	public String getName(){
		return name;
	}
}