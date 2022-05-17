package info.sanaebadi.retrofittv.model;

import com.google.gson.annotations.SerializedName;

public class TvMazeModelItem{

	@SerializedName("voice")
	private boolean voice;

	@SerializedName("character")
	private Character character;

	@SerializedName("person")
	private Person person;

	@SerializedName("self")
	private boolean self;

	public boolean isVoice(){
		return voice;
	}

	public Character getCharacter(){
		return character;
	}

	public Person getPerson(){
		return person;
	}

	public boolean isSelf(){
		return self;
	}
}