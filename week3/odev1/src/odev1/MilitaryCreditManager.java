package odev1;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı");
		
	}

	public void Save() {
		// TODO Auto-generated method stub
		super.Save();
	}

}