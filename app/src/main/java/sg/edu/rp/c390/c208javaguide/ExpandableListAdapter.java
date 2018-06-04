package sg.edu.rp.c390.c208javaguide;
/**
  + * Created by 16046562 on 22/11/2017.
  + */
import java.util.HashMap;
import java.util.List;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context _context;
    private List<String> _listDataHeaders; // header titles
    // child data in format of header title, child title

    private HashMap<String, List<String>> _listDataChilds;
    public ExpandableListAdapter(Context context, List<String> listDataHeaders, HashMap<String, List<String>> listChildDatas) {
        this._context = context;
        this._listDataHeaders = listDataHeaders;
        this._listDataChilds = listChildDatas;
    }
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChilds.get(this._listDataHeaders.get(groupPosition)).get(childPosititon);
    }
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }
    @Override
    public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_rowchild, null);
        }
        TextView txtListChild = (TextView) convertView.findViewById(R.id.lblListItems);
        txtListChild.setText(childText);
        return convertView;
    }
    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChilds.get(this._listDataHeaders.get(groupPosition)).size();
    }
    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeaders.get(groupPosition);
    }
    @Override
    public int getGroupCount() {
        return this._listDataHeaders.size();
    }
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_groupheader, null);
        }
        TextView lblListHeaders = (TextView) convertView.findViewById(R.id.lblListHeaders);
        lblListHeaders.setTypeface(null, Typeface.BOLD);
        lblListHeaders.setText(headerTitle);
        return convertView;
    }
    @Override
    public boolean hasStableIds() {
        return false;
    }
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}