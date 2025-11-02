package com.example.bt_recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerSong;
    ArrayList<Song> songList;
    SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerSong = findViewById(R.id.recyclerSong);
        songList = new ArrayList<>();

        songList.add(new Song("Perfect", "Ed Sheeran", R.drawable.song1));
        songList.add(new Song("Shallow", "Lady Gaga & Bradley Cooper", R.drawable.song2));
        songList.add(new Song("Someone Like You", "Adele", R.drawable.song3));
        songList.add(new Song("Let Her Go", "Passenger", R.drawable.song4));
        songList.add(new Song("Believer", "Imagine Dragons", R.drawable.song5));
        songList.add(new Song("Counting Stars", "OneRepublic", R.drawable.song6));
        songList.add(new Song("Shape of You", "Ed Sheeran", R.drawable.song7));
        songList.add(new Song("Stay With Me", "Sam Smith", R.drawable.song8));
        songList.add(new Song("See You Again", "Wiz Khalifa ft. Charlie Puth", R.drawable.song9));
        songList.add(new Song("Havana", "Camila Cabello ft. Young Thug", R.drawable.song10));
        songList.add(new Song("Love Story", "Taylor Swift", R.drawable.song11));
        songList.add(new Song("Cheap Thrills", "Sia", R.drawable.song12));
        songList.add(new Song("Girls Like You", "Maroon 5 ft. Cardi B", R.drawable.song13));
        songList.add(new Song("Night Changes", "One Direction", R.drawable.song14));
        songList.add(new Song("We Don’t Talk Anymore", "Charlie Puth ft. Selena Gomez", R.drawable.song15));

        recyclerSong.setLayoutManager(new LinearLayoutManager(this));
        songAdapter = new SongAdapter(this, songList);
        recyclerSong.setAdapter(songAdapter);
    }
}
