package nerdy.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import nerdy.service.SakilaService;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pageMsg;
	
	@Autowired
	@Qualifier("sakilaService")
	private SakilaService sakilaService;
	
	public String index() {
		
		int actors = sakilaService.queryActor();
		pageMsg = actors+"";
		
        return "success";
    }

	public String getPageMsg() {
		return pageMsg;
	}

	public void setPageMsg(String pageMsg) {
		this.pageMsg = pageMsg;
	}

	
}
