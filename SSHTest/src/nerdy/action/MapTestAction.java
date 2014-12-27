package nerdy.action;

import com.opensymphony.xwork2.ActionSupport;

public class MapTestAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;
	
	public String index() {
		msg = "這是個googleMap";
		
        return "success";
    }

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
