package ali.naseem.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView place = findViewById(R.id.place);
        TextView description = findViewById(R.id.description);
        ImageView imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();
        if (intent != null) {
            place.setText(intent.getIntExtra(Constants.PLACE, -1));
            description.setText(intent.getIntExtra(Constants.DESCRIPTION, -1));
            imageView.setImageResource(intent.getIntExtra(Constants.IMAGE, -1));
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
