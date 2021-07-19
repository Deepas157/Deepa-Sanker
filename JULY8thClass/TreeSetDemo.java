package JULY8thClass;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSetDemo obj=new TreeSetDemo();
		Set<Question>qset=obj.getQuestionSet();
		System.out.println(qset);
	}
	public Set<Question> getQuestionSet(){
		Set<Question>questionSet=new TreeSet<Question>();
		Question q1=new Question("1", "who is cm", "chiefmember", "cheifminister", "cm", "2");
		Question q2=new Question("2", "who is pm", "primemember", "primeminister", "pm", "2");
		questionSet.add(q1);
		questionSet.add(q2);
		return questionSet;
	}
}
class Question implements Comparable<Question>{
	String qid,question,option1,option2,option3, answer;
	
	public Question(String qid, String question, String option1, String option2, String option3, String answer) {
		this.qid = qid;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.answer = answer;
	}
	public String toString() {
		return "Question qid ="+qid+"\n question="+question+"\n option1="+option1+"\n option2="+option2+"\n option3="+option3+"\n Answer="+answer +"\n";
	}
	@Override
	public int compareTo(Question o) {
		return this.qid.compareTo(o.qid);
	}
}
