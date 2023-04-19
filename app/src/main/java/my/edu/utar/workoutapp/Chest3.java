package my.edu.utar.workoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Chest3 extends Fragment {

    TextView textView1;
    VideoView videoView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chest1, container, false);
        videoView = view.findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        String path = "android.resource://" + getContext().getPackageName() + "/" + R.raw.cable_flyes;
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

        textView1.setText("Cable flyes, also known as cable crossovers, are a strength training exercise that targets the chest muscles. This exercise is typically performed using a cable machine, which consists of a weight stack connected to a cable and handle attachments.");
    }
}