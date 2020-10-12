package comp5703.sydney.edu.au.comp5703_i_need_help;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainPageActivity extends AppCompatActivity {
    private RecyclerView RecyclerViewStudentSta;
    private RecyclerViewAdapter adapter;
    private List<ListItem> listItems= new ArrayList<>();
    private RecyclerViewAdapter.RecyclerViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        RecyclerViewStudentSta = findViewById(R.id.RecyclerView_StudentStatus);
        RecyclerViewStudentSta.setHasFixedSize(true);
        RecyclerViewStudentSta.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        initQuestions();
        setAdapter();
    }

    private void setAdapter(){
        setOnClickListner();
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(listItems,listener);

    }

    private void setOnClickListner() {
        listener = new RecyclerViewAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), MainPageActivity.class);
                startActivity(intent);
            }
        };
    }

    private void initQuestions(){
        for(int i = 0; i <=5; i++){
            ListItem listItem = new ListItem(
               "Heading" + (i+1),
               "Content"
            );
            listItems.add(listItem);
        }
    }

}