package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {
    private TextView mTextViewResult;
    //    String url="https://usi-saas.vnexpress.net/";
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = (TextView) findViewById(R.id.idStt);
        tv.setText("");
        mTextViewResult = findViewById(R.id.idStt);

        OkHttpClient client = new OkHttpClient();
        String url = "https://usi-saas.vnexpress.net/index/get?offset=0&limit=15&frommobile=0&sort=like&is_onload=0&objectid=4143794&objecttype=1&siteid=1003750&categoryid=1003784&sign=1430029c4aadd98b0c7369e708a0c016&cookie_aid=fa5989090095b998&usertype=4&template_type=1&app_mobile_device=0&title=Th%C3%AAm%2029%20ca%20nhi%E1%BB%85m%20nCoV%20-%20VnExpress%20S%E1%BB%A9c%20kh%E1%BB%8Fe&sort_by=like&fbclid=IwAR2OIVZiCw-XiBI_mCE4uPVac2sFIDZyZOThIcGksod9dTmGq7f2YikH_-w";

        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                System.out.println("sucess"+response);
                System.out.println("abcd"+response.body().string());

            }

            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {

            }

        });
    }
}

//        Retrofit retrofit= new Retrofit.Builder()
//                .baseUrl(url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        callapi api=retrofit.create(callapi.class);
//
//        Call<List<object.ITEM>> call=api.getmodels();
//        call.enqueue(new Callback<List<object.ITEM>>() {
//            @Override
//            public void onResponse(Call<List<object.ITEM>> call, Response<List<object.ITEM>> response) {
////                List<object.ITEM> data=response.body();
//                System.out.println("RES SUCESS" + response);
//                System.out.println("DATA" + response.body());
//
//
//            }
//            @Override
//            public void onFailure(Call<List<object.ITEM>> call, Throwable t) {
//
//            }
//
//        });

//
//    }
//
//
//}