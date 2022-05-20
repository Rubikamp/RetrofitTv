package info.sanaebadi.retrofittv.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.List;

import info.sanaebadi.retrofittv.api.RetrofitClient;
import info.sanaebadi.retrofittv.databinding.ActivityMainBinding;
import info.sanaebadi.retrofittv.model.TvMazeModelItem;
import info.sanaebadi.retrofittv.ui.adapter.TvActorsAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private TvActorsAdapter adapter;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        configRecyclerView();
        getActorsList();
    }

    private void configRecyclerView() {
        binding.recyclerviewTv.setHasFixedSize(true);
        binding.recyclerviewTv.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));

    }

    private void getActorsList() {
        Call<List<TvMazeModelItem>> listCall = RetrofitClient.getInstance().getApiInterfcae().getHeroList();
        listCall.enqueue(new Callback<List<TvMazeModelItem>>() {
            @Override
            public void onResponse(Call<List<TvMazeModelItem>> call, Response<List<TvMazeModelItem>> response) {
                List<TvMazeModelItem> cityModelItemList = response.body();
                adapter = new TvActorsAdapter(cityModelItemList);
                binding.recyclerviewTv.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<TvMazeModelItem>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

}