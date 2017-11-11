package apex.app.customrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 11/8/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myViewHolder> {

    private Context c;
    private int[] images;

    public CustomAdapter(Context c, int[] images) {
        this.c = c;
        this.images = images;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(c).inflate(R.layout.single_list_item,parent,false);
        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.IV_list_image.setImageResource(images[position]);
        holder.TV_title.setText("Marriage Ceremony");
        holder.TV_subtitle.setText("Description of Marriage Ceremony Description of Marriage Ceremony Description of Marriage Ceremony.");
        holder.TV_notification.setText("5");
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        ImageView IV_list_image;
        TextView TV_title, TV_subtitle, TV_notification;

        public myViewHolder(View itemView) {
            super(itemView);
            IV_list_image = itemView.findViewById(R.id.IV_list_image);
            TV_title = itemView.findViewById(R.id.TV_title);
            TV_subtitle = itemView.findViewById(R.id.TV_subtitle);
            TV_notification = itemView.findViewById(R.id.TV_notification);
        }
    }
}
