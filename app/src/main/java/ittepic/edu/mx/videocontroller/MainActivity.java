package ittepic.edu.mx.videocontroller;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView)findViewById(R.id.vdw_video);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");
        videoView.setMediaController(mediaController);
    }
}
