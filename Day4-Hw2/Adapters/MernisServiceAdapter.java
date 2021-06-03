package Odev.Adapters;

import Odev.Abstract.CustomerCheckService;
import Odev.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (Exception e) {
			return false;
		}
	}
}
