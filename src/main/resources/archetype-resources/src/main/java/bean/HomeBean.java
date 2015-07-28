package ${package}.bean;

import com.jsmart5.framework.util.WebText;
import com.jsmart5.framework.manager.WebContext;
import com.jsmart5.framework.annotation.WebBean;

import ${package}.service.SpringService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

@WebBean
public class HomeBean {

    @Autowired
    private SpringService springService;

    public void updateClockTime(String clockTime) {
		if (!StringUtils.isBlank(clockTime)) {
			WebContext.addSuccess("feedback", WebText.getString("texts", "async.archetype.clock.updated", clockTime));
		} else {
			WebContext.addWarning("feedback", WebText.getString("texts", "async.archetype.clock.error"));
		}
    }

}
