package org.xiaonuan.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.struts2.json.JSONUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("weiboAction")
@Scope("prototype")
public class WeiboAction extends ActionSupport{
	
	final static String UID="1140584895";
	final static String APK="2.00ZOmLPB0ampmXb17fbb3fb9Atv4XC";
	public Map responseJson;
	
	
	public Map getResponseJson() {
		return responseJson;
	}


	public void setResponseJson(Map responseJson) {
		this.responseJson = responseJson;
	}


	public String getWeiBo()throws Exception
	{
			String ad = "https://api.weibo.com/2/statuses/user_timeline.json?&uid=" + UID
					+ "&access_token="+APK;
			StringBuffer sb = new StringBuffer();
			try {
				URL url = new URL(ad);
				URLConnection connnection = url.openConnection();
				BufferedReader br = new BufferedReader(new InputStreamReader(
						connnection.getInputStream(), "utf-8"));

				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			Map o = (Map) JSONUtil.deserialize(sb.toString());
			this.setResponseJson(o);
			System.out.println(sb.toString());
			return "sussess";
	}
	

}
