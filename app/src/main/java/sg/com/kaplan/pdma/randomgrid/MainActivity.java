package sg.com.kaplan.pdma.randomgrid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);

        final ImageView[] array = new ImageView[9];
        array[0] = imageView;
        array[1] = imageView2;
        array[2] = imageView3;
        array[3] = imageView4;
        array[4] = imageView5;
        array[5] = imageView6;
        array[6] = imageView7;
        array[7] = imageView8;
        array[8] = imageView9;

        final Random r = new Random();
        for(int i = 0; i < 9; i++) {
            array[i].setVisibility(View.INVISIBLE);

            array[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.setVisibility(View.INVISIBLE);
                    int n = r.nextInt(9);
                    array[n].setVisibility(View.VISIBLE);
                }
            });
        }

        int n = r.nextInt(9);
        array[n].setVisibility(View.VISIBLE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
