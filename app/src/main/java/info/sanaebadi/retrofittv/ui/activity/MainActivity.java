package info.sanaebadi.retrofittv.ui.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        binding.recyclerviewTv.setLayoutManager(new GridLayoutManager(binding.recyclerviewTv.getContext(), 1));
        binding.recyclerviewTv.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
    }

    private void getActorsList() {
        Call<List<TvMazeModelItem>> listCall = RetrofitClient.getInstance().getApiInterfcae().getHeroList();
        listCall.enqueue(new Callback<List<TvMazeModelItem>>() {
            @Override
            public void onResponse(@NonNull Call<List<TvMazeModelItem>> call, @NonNull Response<List<TvMazeModelItem>> response) {
                List<TvMazeModelItem> cityModelItemList = response.body();
                adapter = new TvActorsAdapter(cityModelItemList);
                binding.recyclerviewTv.setAdapter(adapter);
            }

            @Override
            public void onFailure(@NonNull Call<List<TvMazeModelItem>> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

}