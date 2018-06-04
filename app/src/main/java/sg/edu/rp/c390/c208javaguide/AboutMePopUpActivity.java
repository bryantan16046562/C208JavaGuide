package sg.edu.rp.c390.c208javaguide;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutMePopUpActivity extends AppCompatActivity {
     Dialog myDialog;
     TextView txtclose;
     Button blog;
     Button github;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.fragment_noteresources);
         Intent intent = getIntent();

         myDialog = new Dialog(this);
         myDialog.setContentView(R.layout.custompopup);
         txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
         txtclose.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v){
                 myDialog.dismiss();
             }
         });
         blog = (Button) myDialog.findViewById(R.id.btnblog);
         blog.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v){
                 Intent aboutapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bryantanportfolio.weebly.com"));
                 startActivity(aboutapp);
             }
         });
         /*
         github = (Button) myDialog.findViewById(R.id.btngithub);
         github.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v){
                 Intent aboutapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/mastermindtan/C208JavaGuide"));
                 startActivity(aboutapp);
             }
         });
         */
         myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
         myDialog.show();
     }
 }