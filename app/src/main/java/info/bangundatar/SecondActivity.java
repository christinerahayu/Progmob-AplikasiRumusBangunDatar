package info.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description;

    String judul2, detail2;
    int fotobangundatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);

        getData();
        setData();

    }

    private void getData(){
        if(getIntent().hasExtra("fotobangundatar") && getIntent().hasExtra("judul2") && getIntent().hasExtra("detail2")){

            judul2 = getIntent().getStringExtra("judul2");
            detail2 = getIntent().getStringExtra("detail2");
            fotobangundatar = getIntent().getIntExtra("fotobangundatar",1);

        }else{
            Toast.makeText(this,"tidak ada data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        title.setText(judul2);
        description.setText(detail2);
        mainImageView.setImageResource(fotobangundatar);
    }
}
