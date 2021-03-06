package MDSplus;

/**
 * Class for DTYPE_RANGE
 * @author manduchi
 * @version 1.0
 * @updated 30-mar-2009 13.44.41
 */
public class Range extends Compound
{
	public Range(Data begin, Data ending, Data deltaval,
	        Data help, Data units, Data error, Data validation)
	{
	    super(help, units, error, validation);
	    clazz = CLASS_R;
	    dtype = DTYPE_RANGE;
	    descs = new Data[]{begin, ending, deltaval};
	}
	public Range(Data begin, Data ending, Data deltaval)
	{
	    this(begin, ending, deltaval, null, null, null, null);
	}
	public Range(Data help, Data units, Data error, Data validation)
	{
	    super(help, units, error, validation);
	    clazz = CLASS_R;
	    dtype = DTYPE_RANGE;
	    descs = new Data[3];
	}
	public Range()
	{
	    this(null, null, null, null);
	}

	public static Range getData(Data help, Data units, Data error, Data validation)
	{
	    return new Range(help, units, error, validation);
	}

	public Data getBegin()
	{
	    return descs[0];
	}

	public Data getEnding()
	{
	    return descs[1];
	}

	public Data getDeltaVal()
	{
	    return descs[2];
	}

	/**
	 *
	 * @param data
	 */
	public void setBegin(Data data)
	{
	    descs[0] = data;
	}

	/**
	 *
	 * @param data
	 */
	public void setEnding(Data data)
	{
	    descs[1] = data;
	}

	/**
	 *
	 * @param data
	 */
	public void setdeltaVal(Data data)
	{
	    descs[2] = data;
	}

}