package my.edu.utar.workoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


public class Leg4 extends Fragment {

    VideoView videoView;
    View view;
    TextView textView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_chest1, container, false);
        videoView = view.findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        String path = "android.resource://" + getContext().getPackageName() + "/" + R.raw.l4;
        videoView.setVideoPath(path);


        textView1 = view.findViewById(R.id.textView1);

        return view;

    }

    @Override
    public void onPause() {
        super.onPause();
        if (videoView.isPlaying()) {
            videoView.pause();
        }
        textView1.setText("");
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!videoView.isPlaying()) {
            videoView.start();
        }
        textView1.setText("The leg press is a strength training exercise that primarily works your lower body muscles, including your quadriceps, hamstrings, and glutes. It is performed on a machine that allows you to push a weighted platform with your legs.");
    }
}