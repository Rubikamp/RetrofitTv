package info.sanaebadi.retrofittv.api;

import java.util.List;

import info.sanaebadi.retrofittv.model.TvMazeModelItem;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/shows/1/cast")
    Call<List<TvMazeModelItem>> getHeroList();
}
