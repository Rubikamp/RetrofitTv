package info.sanaebadi.retrofittv.ui.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import info.sanaebadi.retrofittv.databinding.ActorsListRowBinding;
import info.sanaebadi.retrofittv.model.TvMazeModelItem;

public class TvActorsAdapter extends RecyclerView.Adapter<TvActorsAdapter.TvActorrVieWholder> {

    private List<TvMazeModelItem> tvMazeModelItemList;

    public CityNameAdapter(List<TvMazeModelItem> tvMazeModelItemList) {
        this.tvMazeModelItemList = tvMazeModelItemList;
    }


    @NonNull
    @Override
    public TvActorrVieWholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TvActorrVieWholder(ActorsListRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TvActorrVieWholder holder, int position) {
        TvMazeModelItem item = tvMazeModelItemList.get(position);
        Picasso.get().load(item.getPerson().getImage().getMedium()).centerCrop().into(holder.binding.imageviewActor);
        holder.binding.textviewActorName.setText(item.getPerson().getName());
        holder.binding.textviewActorCountry.setText(item.getPerson().getCountry().getName());
        holder.binding.textviewActorBirthday.setText(item.getPerson().getBirthday());
        holder.binding.textviewActorGender.setText(item.getPerson().getGender());
    }

    @Override
    public int getItemCount() {
        return tvMazeModelItemList.size();
    }

    static class TvActorrVieWholder extends RecyclerView.ViewHolder {
        private ActorsListRowBinding binding;

        public TvActorrVieWholder(ActorsListRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

    }
}