package info.bangundatar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String judul2[],detail2[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String judul[], String detail[], int img[]){
        context = ct;
        judul2 = judul;
        detail2 = detail;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.judulbangundatar.setText(judul2[position]);
        holder.fotobangundatar. setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("judul2", judul2[position]);
                intent.putExtra("detail2", detail2[position]);
                intent.putExtra("fotobangundatar", images[position]);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView judulbangundatar;
        ImageView fotobangundatar;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            judulbangundatar = itemView.findViewById(R.id.judulbangundatar);
            fotobangundatar = itemView.findViewById(R.id.fotobangundatar);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
