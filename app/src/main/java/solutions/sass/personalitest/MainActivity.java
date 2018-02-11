package solutions.sass.personalitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    RatingBar itemRating;
    TextView itemView, questionView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemRating = (RatingBar)findViewById(R.id.item_rating);
        itemView = (TextView)findViewById(R.id.item_display);
        questionView = (TextView)findViewById(R.id.question_display);
    }
}
