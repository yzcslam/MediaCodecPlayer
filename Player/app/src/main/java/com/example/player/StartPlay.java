package com.example.player;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class StartPlay extends AppCompatActivity {

    private Button play_btn;
    private Button pause_btn;
    private Button stop_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_start);

        play_btn=findViewById(R.id.player_btn);
        pause_btn=findViewById(R.id.player_pause);
        stop_btn=findViewById(R.id.player_stop);

        //按钮监听
        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        pause_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        stop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void MediaInfoGet()
    {
        String Media_name="test.mp4";
        MediaExtractor media=new MediaExtractor();

        //设置数据源
        try {
            media.setDataSource(Media_name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //进行数据解复用
        MediaFormat mformat;
        
    }
}
