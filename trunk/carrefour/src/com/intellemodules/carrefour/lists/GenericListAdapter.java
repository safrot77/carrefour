package com.intellemodules.carrefour.lists;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.intellemodules.carrefour.R;

public class GenericListAdapter extends ArrayAdapter<ListDataItem> {

	Context context;
	List<ListDataItem> dataItems;
	
	public GenericListAdapter(Context context, List<ListDataItem> objects) {
		super(context,R.layout.generic_list_item_layout , objects);
		this.context = context;
		this.dataItems = objects;
		
		
		
	}
	
	
	static class ViewHolder {
		public ImageView imageView;
		public TextView textView;
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder holder;
		View rowView = convertView;
		if (rowView == null) {
			LayoutInflater inflater = (LayoutInflater) /*context.getLayoutInflater();*/ context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(R.layout.generic_list_item_layout, null, true);
			holder = new ViewHolder();
			holder.textView = (TextView) rowView.findViewById(R.id.title);
			holder.imageView = (ImageView) rowView.findViewById(R.id.icon);
			rowView.setTag(holder);
		} else {
			holder = (ViewHolder) rowView.getTag();
		}

		ListDataItem dataItem = dataItems.get(position);
		holder.textView.setText(dataItem.getTitle());
		holder.imageView.setImageDrawable(dataItem.getDrawable());

		return rowView;
	}

}
