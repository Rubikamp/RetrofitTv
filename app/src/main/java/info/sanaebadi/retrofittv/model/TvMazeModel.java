package info.sanaebadi.retrofittv.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TvMazeModel{

	@SerializedName("TvMazeModel")
	private List<TvMazeModelItem> tvMazeModel;

	public List<TvMazeModelItem> getTvMazeModel(){
		return tvMazeModel;
	}
}