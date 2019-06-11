import java.util.Comparator;

public class ReadsComparator implements Comparator<Story>{

	@Override
	public int compare(Story arg0, Story arg1) {
		if(arg0.getNoOfReads()>arg1.getNoOfReads())
			return 1;
		else  if(arg0.getNoOfReads()<arg1.getNoOfReads())
			return -1;
		else
		return 0;
	}

	
		
}