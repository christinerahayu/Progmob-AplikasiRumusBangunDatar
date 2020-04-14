package info.bangundatar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String judul[], detail[];
    int images[] = {R.drawable.segitigaa, R.drawable.persegii, R.drawable.persegipanjang, R.drawable.jajar, R.drawable.belah, R.drawable.layang, R.drawable.trapesiumm, R.drawable.lingkarann};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        judul = getResources().getStringArray(R.array.bangun_datar);
        detail = getResources().getStringArray(R.array.detail);

        MyAdapter myAdapter = new MyAdapter(this, judul, detail, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
