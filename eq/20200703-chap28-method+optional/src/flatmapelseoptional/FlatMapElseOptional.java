package flatmapelseoptional;

import java.util.Optional;

class ContInfo
{
	Optional<String> phone;
	Optional<String> adrs;
	
	public ContInfo (Optional<String> ph, Optional<String> ad)
	{
		phone = ph;
		adrs = ad;
	}
	public Optional<String> getPhone()
	{
		return phone;
	}
	public Optional<String> getAdrs()
	{
		return adrs;
	}
}

public class FlatMapElseOptional
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Optional<ContInfo> ci = Optional.of(new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea")));
		
		String phone = ci.flatMap(c -> c.getPhone()).orElse("There is no phone number.");
		String adrs = ci.flatMap(c -> c.getAdrs()).orElse("There is no address.");
		
		System.out.println(phone);
		System.out.println(adrs);
	}

}
