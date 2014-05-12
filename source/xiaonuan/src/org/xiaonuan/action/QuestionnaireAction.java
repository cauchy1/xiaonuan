package org.xiaonuan.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.xiaonuan.model.Anwser;
import org.xiaonuan.service.AnwserService;

import com.opensymphony.xwork2.ActionSupport;

@Controller("questionnaireAction")
@Scope("prototype")
public class QuestionnaireAction extends ActionSupport{
	
	private String answer;
	
	@Resource
	private AnwserService anwserService;
	
	public String getUserAnswers()throws Exception
	{
		Anwser userAnwser=new Anwser();
		userAnwser.setAnwser(this.answer);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");  
		Date date=new java.util.Date();  
		String dateStr=sdf.format(date);  
		userAnwser.setDate(dateStr);
		userAnwser.setId(0);
		anwserService.saveAnwser(userAnwser);
		return "success";
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public AnwserService getAnwserService() {
		return anwserService;
	}

	public void setAnwserService(AnwserService anwserService) {
		this.anwserService = anwserService;
	}
	

}
