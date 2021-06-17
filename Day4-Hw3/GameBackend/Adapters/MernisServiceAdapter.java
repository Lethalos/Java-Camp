package GameBackend.Adapters;

import GameBackend.Abstract.CustomerCheckService;
import GameBackend.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getName(), 
				customer.getLastName(), customer.getDateOfBirth());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;			
		}
	}
	
}
