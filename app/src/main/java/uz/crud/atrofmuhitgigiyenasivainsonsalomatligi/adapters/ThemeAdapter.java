package uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.R;
import uz.crud.atrofmuhitgigiyenasivainsonsalomatligi.notes.ThemeNote;


public class ThemeAdapter extends RecyclerView.Adapter<ThemeAdapter.ViewHolder> {

    private List<ThemeNote> mData;
    private final ItemClickListener mClickListener;
    private final Activity activity;


    // data is passed into the constructor
    public ThemeAdapter(Activity activity, List<ThemeNote> data, ItemClickListener mClickListener) {
        this.mData = data;
        this.mClickListener=mClickListener;
        this.activity=activity;
    }

    // inflates the row layout from xml when needed
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ThemeNote themeNote = mData.get(position);

        holder.title.setText("- "+themeNote.getTitle());

        holder.title.setOnClickListener(v -> {
            if (mClickListener != null) mClickListener.onItemClick(themeNote);
        });

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void swapData(List<ThemeNote> userNoteList) {
        mData = userNoteList;
        notifyDataSetChanged();
    }



    // stores and recycles views as they are scrolled off screen
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // allows clicks events to be caught
//   void setClickListener(ItemClickListener itemClickListener) {
//            this.mClickListener = itemClickListener;
//    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(ThemeNote themeNote);
    }
}