package sg.edu.rp.c390.c208javaguide;

/**
 * Created by 16046562 on 29/11/2017.
 */
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class notesresourcesFragment extends Fragment {
    CardView pdf;
    CardView ws;
    CardView exam;
    CardView aboutme;

    public notesresourcesFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_noteresources, container, false);
        pdf = (CardView) view.findViewById(R.id.pdfId);
        ws = (CardView) view.findViewById(R.id.worksheetId);
        exam = (CardView) view.findViewById(R.id.examsId);
        aboutme = (CardView) view.findViewById(R.id.aboutmeId);
        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse6P = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1KBbDydJh9TR1VNhC9bivB6eDpGOaUb3s?usp=sharing"));
                startActivity(browse6P);
            }
        });
        ws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browseworksheet = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1uDLwFGWC4VupyoaBrIBiLzyp1ngtbT38?usp=sharing"));
                startActivity(browseworksheet);
            }
        });
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browseexam = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1DFeIZbzL4hQjkHvRl3i-WCp-BnVt4IBW?usp=sharing"));
                startActivity(browseexam);
            }
        });
        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutme = new Intent(notesresourcesFragment.this.getActivity(),AboutMePopUpActivity.class);
                startActivity(aboutme);
            }
        });
        return view;
    }
}

