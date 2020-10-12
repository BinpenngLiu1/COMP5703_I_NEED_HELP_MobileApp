package comp5703.sydney.edu.au.comp5703_i_need_help;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<ListItem> listItems;
    private Context mContext;
    private RecyclerViewClickListener listener;


    public RecyclerViewAdapter( List<ListItem> listItems, RecyclerViewClickListener listener) {
        this.listItems = listItems;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, final int position) {
       ListItem listItem = listItems.get(position);
       holder.textViewHead.setText(listItem.getHead());
       holder.textViewContent.setText(listItem.getContent());

    }
    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textViewHead;
        public TextView textViewContent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewHead = itemView.findViewById(R.id.TextView_Header);
            textViewContent = itemView.findViewById(R.id.TextView_Content);
            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View v) {
            listener.onClick(itemView, getAdapterPosition());
        }
    }
}
