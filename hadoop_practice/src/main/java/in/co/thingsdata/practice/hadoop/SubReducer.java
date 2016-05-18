package in.co.thingsdata.practice.hadoop;

import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class SubReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable>{ 

	public void reduce(Text key, Iterable<DoubleWritable> values, Context context ) throws IOException, InterruptedException{
		
		long totalBytes = 0;
		for (DoubleWritable val : values){
			totalBytes += val.get();
		}
		
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(6);
		df.format(totalBytes);
	 context.write(new Text(key), new DoubleWritable(totalBytes));
	}
	
	
}
