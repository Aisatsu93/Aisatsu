package functiondemo2;

import java.util.function.Function;

public class FunctionDemo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Function<Double, Double> cti = d -> d * 0.393701;
		Function<Double, Double> itc = d -> d * 2.54;
		System.out.println("1cm = " + cti.apply(1.0) + "inch");
		System.out.println("1inch = " + itc.apply(1.0) + "cm");
	}

}
