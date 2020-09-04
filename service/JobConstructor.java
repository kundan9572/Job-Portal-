package service;

public class JobConstructor {
	
	int jobid;
	String jobtitle;
	String jobDescription;
	String website;
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.jobDescription = website;
	}
	
	public JobConstructor(int jobid, String jobtitle, String jobDescription, String website) {
		super();
		this.jobid = jobid;
		this.jobtitle = jobtitle;
		this.jobDescription = jobDescription;
		this.website = website;
	}
	
	

}
