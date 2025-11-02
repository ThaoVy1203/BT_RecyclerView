package com.example.bt_recyclerview;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SongDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        ImageView imgSong = findViewById(R.id.imgSongDetail);
        TextView txtTitle = findViewById(R.id.txtSongTitle);
        TextView txtArtist = findViewById(R.id.txtSongArtist);
        FloatingActionButton btnPlay = findViewById(R.id.btnPlay);
        ImageButton btnBack = findViewById(R.id.btnBack);

        String title = getIntent().getStringExtra("title");
        String artist = getIntent().getStringExtra("artist");
        int image = getIntent().getIntExtra("image", 0);

        txtTitle.setText(title);
        txtArtist.setText(artist);
        imgSong.setImageResource(image);

        btnPlay.setOnClickListener(v ->
                Toast.makeText(this, "🎵 Đang phát: " + title, Toast.LENGTH_SHORT).show());
        btnBack.setOnClickListener(v -> finish());
    }
}
