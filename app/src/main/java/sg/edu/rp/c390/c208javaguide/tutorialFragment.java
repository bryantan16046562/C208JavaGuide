package sg.edu.rp.c390.c208javaguide;

/**
 * Created by 16046562 on 29/11/2017.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class tutorialFragment extends Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeaders;
    HashMap<String, List<String>> listDataChilds;
    public tutorialFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tutorial, container, false);
        // get the listview
        expListView = (ExpandableListView) view.findViewById(R.id.lvExp);
        // preparing list data
        prepareListData();
        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeaders, listDataChilds);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                //Toast.makeText(getActivity(),listDataHeader.get(groupPosition) + " Expanded", Toast.LENGTH_SHORT).show();
            }
        });
        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                //Toast.makeText(getActivity(),listDataHeader.get(groupPosition) + " Collapsed",Toast.LENGTH_SHORT).show();
            }
        });
        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                if (groupPosition == 0) {
                    if (childPosition == 0 ){//java operators
                        // Intent declareintent1 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(declareintent1);
                        Intent declareintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/operators/"));
                        startActivity(declareintent1);
                    } else if (childPosition == 1 ){ // data types
                        // Intent declareintent2 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(declareintent2);
                        Intent declareintent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/data-types/"));
                        startActivity(declareintent2);
                    } else if (childPosition == 2 ){ // java variables
                        // Intent declareintent3 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(declareintent3);
                        Intent declareintent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/variables/"));
                        startActivity(declareintent3);
                    } else if (childPosition == 3 ){ // java arrays
                        // Intent declareintent4 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(declareintent4);
                        Intent declareintent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/arrays/"));
                        startActivity(declareintent4);
                    }
                } else if (groupPosition == 1) {
                    if (childPosition == 0 ){ // java if statements
                        // Intent flowintent1 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent1);
                        Intent flowintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/decision-making/if/"));
                        startActivity(flowintent1);
                    } else if (childPosition == 1 ){ // java if-else statement
                        // Intent flowintent2 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent2);
                        Intent flowintent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/decision-making/if-else/"));
                        startActivity(flowintent2);
                    } else if (childPosition == 2 ){ // java else-if statements
                        // Intent flowintent3 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent3);
                        Intent flowintent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/decision-making/else-if/"));
                        startActivity(flowintent3);
                    } else if (childPosition == 3 ){ // java switch statements
                        // Intent flowintent4 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent4);
                        Intent flowintent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/decision-making/switch/"));
                        startActivity(flowintent4);
                    } else if (childPosition == 4 ){ // java while loops
                        // Intent flowintent5 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent6);
                        Intent flowintent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/loops/while/"));
                        startActivity(flowintent5);
                    } else if (childPosition == 5 ){ // java do-while loops
                        // Intent flowintent6 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent6);
                        Intent flowintent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/loops/do-while/"));
                        startActivity(flowintent6);
                    } else if (childPosition == 6 ){ // java for loops
                        // Intent flowintent7 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent7);
                        Intent flowintent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/loops/for/"));
                        startActivity(flowintent7);
                    } else if (childPosition == 7 ){ // java difference between Break and Continue statements loops
                        // Intent flowintent8 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(flowintent8);
                        Intent flowintent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/difference-between-break-and-continue-statement/"));
                        startActivity(flowintent8);
                    }
                } else if (groupPosition == 2) {
                    if (childPosition == 0 ){ // java string classes
                        // Intent miscellaneousintent1 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(miscellaneousintent1);
                        Intent miscellaneousintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/strings/"));
                        startActivity(miscellaneousintent1);
                    } else if (childPosition == 1 ){ // java date & time
                        // Intent miscellaneousintent2 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(miscellaneousintent2);
                        Intent miscellaneousintent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/date-time/"));
                        startActivity(miscellaneousintent2);
                    }
                } else if (groupPosition == 3) {
                    if (childPosition == 0 ){ // java constructors
                        // Intent oopsintent1 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(oopsintent1);
                        Intent oopsintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/constructor/"));
                        startActivity(oopsintent1);
                    } else if (childPosition == 1 ){ // java static and this Keyword
                        // Intent oopsintent2 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(oopsintent2);
                        Intent oopsintent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/static-and-this-keyword/"));
                        startActivity(oopsintent2);
                    } else if (childPosition == 2 ){ // java super and final Keyword
                        // Intent oopsintent3 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(oopsintent3);
                        Intent oopsintent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/super-final-keywords/"));
                        startActivity(oopsintent3);
                    } else if (childPosition == 3 ){ // java polymorphism
                        // Intent oopsintent4 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(oopsintent4);
                        Intent oopsintent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/polymorphism/"));
                        startActivity(oopsintent4);
                    } else if (childPosition == 4 ){ // java method overriding
                        // Intent oopsintent5 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(oopsintent5);
                        Intent oopsintent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/method-overriding/"));
                        startActivity(oopsintent5);
                    } else if (childPosition == 5 ){ // java enumeration
                        // Intent oopsintent6 = new Intent(tutorialFragment.this.getActivity(),.class);
                        // startActivity(oopsintent6);
                        Intent oopsintent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.in/java-tutorial/enumeration/"));
                        startActivity(oopsintent6);
                    }
                }
                return false;
            }
        });
        return view;
    }
    //prepare list data
    private void prepareListData() {
        listDataHeaders = new ArrayList<String>();
        listDataChilds = new HashMap<String, List<String>>();
        // Adding child data
        listDataHeaders.add("Declaration & Assignments");
        listDataHeaders.add("Flow Control");
        listDataHeaders.add("Miscellaneous");
        listDataHeaders.add("Java OOPs");
        // Adding child data

        List<String> javadeclare = new ArrayList<String>();
        javadeclare.add("Operators");
        javadeclare.add("Data Types");
        javadeclare.add("Variables");
        javadeclare.add("Arrays");

        List<String> javaflow = new ArrayList<String>();
        javaflow.add("if statements");
        javaflow.add("if-else statements");
        javaflow.add("else-if statements");
        javaflow.add("switch statements");
        javaflow.add("while loops");
        javaflow.add("do-while loops");
        javaflow.add("for loops");
        javaflow.add("difference between Break and Continue statements");

        List<String> javamiscellaneous = new ArrayList<String>();
        javamiscellaneous.add("String Class");
        javamiscellaneous.add("Date & Time");

        List<String> javaoops = new ArrayList<String>();
        javaoops.add("Constructor");
        javaoops.add("static and this Keyword");
        javaoops.add("super and final Keyword");
        javaoops.add("Polymorphism");
        javaoops.add("Method Overridding");
        javaoops.add("Enumeration");

        listDataChilds.put(listDataHeaders.get(0), javadeclare); // Header, Child data
        listDataChilds.put(listDataHeaders.get(1), javaflow);
        listDataChilds.put(listDataHeaders.get(2), javamiscellaneous);
        listDataChilds.put(listDataHeaders.get(3), javaoops);
    }
}
