package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerv);

        List<itemRec> items = new ArrayList<itemRec>();
        items.add(new itemRec("RESIDENT EVIL ", "resident-evil@gmail.com", R.drawable.re1));
        items.add(new itemRec("RESIDENT EVIL 2", "re2@gmail.com", R.drawable.re2));
        items.add(new itemRec("RESIDENT EVIL 3 : NEMESIS", "re3nemesis@gmail.com", R.drawable.re3));
        items.add(new itemRec("RESIDENT EVIL 4", "re4@gmail.com", R.drawable.re4));
        items.add(new itemRec("RESIDENT EVIL 5", "re5@gmail.com", R.drawable.re5));
        items.add(new itemRec("RESIDENT EVIL 6", "re6@gmail.com", R.drawable.re6));
        items.add(new itemRec("RESIDENT EVIL 7 : BIOHAZARD", "biohazardvii@gmail.com", R.drawable.re7));
        items.add(new itemRec("RESIDENT EVIL 8 : VILLAGE", "VIIllage8@gmail.com", R.drawable.re8));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapterMobile(getApplicationContext(), items));
    }
}