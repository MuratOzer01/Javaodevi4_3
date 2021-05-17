package Adapter;

import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter {
	
	public boolean playerCheckRealPerson(Player player) {
		
		KPSPublicSoap check = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			result = check.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(), player.getLastName(), player.getAge().getYear());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
		
	}
	
}
