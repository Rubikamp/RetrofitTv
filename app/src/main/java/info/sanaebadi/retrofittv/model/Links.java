package info.sanaebadi.retrofittv.model;

import com.google.gson.annotations.SerializedName;

public class Links{


	@SerializedName("self")
	private Self self;

	public Self getSelf(){
		return self;
	}
}