import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("dsd","pizza");
		logininfo.put("Brometheus","PASSWORD");
		logininfo.put("Mohammed","123123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}