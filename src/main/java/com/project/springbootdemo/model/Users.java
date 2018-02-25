package com.project.springbootdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="sample_data_sql")
public class Users {
	
	private Long cid;
	//@SerializedName("age")
	private Integer age;
	//@SerializedName("class of worker")
	private String class_of_worker;
	//@SerializedName("industry code")
	private String industry_code;
	//@SerializedName("occupation code")
	private String occupation_code;
	//@SerializedName("education")
	private String education;
	//@SerializedName("wage per hour")
	private String wage_per_hour;
	//@SerializedName("last education")
	private String last_education;
	//@SerializedName("marital status")
	private String marital_status;
	//@SerializedName("major industry code")
	private String major_industry_code;
	///@SerializedName("major occupation code")
	private String major_occupation_code;
	//@SerializedName("mace")
	private String mace;
	//@SerializedName("hispanice")
	private String hispanice;
	//@SerializedName("sex")
	private String sex;
	//@SerializedName("member of labour")
	private String member_of_labour;
	//@SerializedName("reason for unemployment")
	private String reason_for_unemployment;
	//@SerializedName("fulltime")
	private String fulltime;
	//@SerializedName("capital gain")
	private String capital_gain;
	//@SerializedName("capital loss")
	private String capital_loss;
	//@SerializedName("dividends")
	private String dividends;
	//@SerializedName("income tax liability")
	private String income_tax_liability;
	//@SerializedName("previous residents region")
	private String previous_residents_region;
	//@SerializedName("previous residents state")
	private String previous_residents_state;
	//@SerializedName("household-with-family")
	private String household_with_family;
	//@SerializedName("household-simple")
	private String household_simple;
	//@SerializedName("weight")
	private String weight;
	//@SerializedName("msa-change")
	private String msa_change;
	//@SerializedName("reg-change")
	private String reg_change;
	//@SerializedName("within-reg-change")
	private String within_reg_change;
	//@SerializedName("lived here")
	private String lived_here;
	//@SerializedName("migration prev res in sunbelt")
	private String migration_prev_res_in_sunbelt;
	//@SerializedName("num persons worked for employer")
	private String num_persons_worked_for_employer;
	//@SerializedName("family members under 118")
	private String family_members_under118;
	//@SerializedName("father birth country")
	private String father_birth_country;
	//@SerializedName("mother birth country")
	private String mother_birth_country;
	//@SerializedName("birth country")
	private String birth_country;
	//@SerializedName("citizenship")
	private String citizenship;
	//@SerializedName("own business or self employed")
	private String own_business_or_self_employed;
	//@SerializedName("fill questionnaire for veteran's admin")
	private String fill_questionnaire_for_veteran_admin;
	//@SerializedName("veterans benefits")
	private String veterans_benefits;
	//@SerializedName("weeks worked in year")
	private String weeks_worked_in_year;
	//@SerializedName("year")
	private String year;
	//@SerializedName("salary range")
	private String salary_range;
	
	@Id
    @GeneratedValue
	public Long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClass_of_worker() {
		return class_of_worker;
	}
	public void setClass_of_worker(String class_of_worker) {
		this.class_of_worker = class_of_worker;
	}
	public String getIndustry_code() {
		return industry_code;
	}
	public void setIndustry_code(String industry_code) {
		this.industry_code = industry_code;
	}
	public String getOccupation_code() {
		return occupation_code;
	}
	public void setOccupation_code(String occupation_code) {
		this.occupation_code = occupation_code;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getWage_per_hour() {
		return wage_per_hour;
	}
	public void setWage_per_hour(String wage_per_hour) {
		this.wage_per_hour = wage_per_hour;
	}
	public String getLast_education() {
		return last_education;
	}
	public void setLast_education(String last_education) {
		this.last_education = last_education;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getMajor_industry_code() {
		return major_industry_code;
	}
	public void setMajor_industry_code(String major_industry_code) {
		this.major_industry_code = major_industry_code;
	}
	public String getMajor_occupation_code() {
		return major_occupation_code;
	}
	public void setMajor_occupation_code(String major_occupation_code) {
		this.major_occupation_code = major_occupation_code;
	}
	public String getMace() {
		return mace;
	}
	public void setMace(String mace) {
		this.mace = mace;
	}
	public String getHispanice() {
		return hispanice;
	}
	public void setHispanice(String hispanice) {
		this.hispanice = hispanice;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMember_of_labour() {
		return member_of_labour;
	}
	public void setMember_of_labour(String member_of_labour) {
		this.member_of_labour = member_of_labour;
	}
	public String getReason_for_unemployment() {
		return reason_for_unemployment;
	}
	public void setReason_for_unemployment(String reason_for_unemployment) {
		this.reason_for_unemployment = reason_for_unemployment;
	}
	public String getFulltime() {
		return fulltime;
	}
	public void setFulltime(String fulltime) {
		this.fulltime = fulltime;
	}
	public String getCapital_gain() {
		return capital_gain;
	}
	public void setCapital_gain(String capital_gain) {
		this.capital_gain = capital_gain;
	}
	public String getCapital_loss() {
		return capital_loss;
	}
	public void setCapital_loss(String capital_loss) {
		this.capital_loss = capital_loss;
	}
	public String getDividends() {
		return dividends;
	}
	public void setDividends(String dividends) {
		this.dividends = dividends;
	}
	public String getIncome_tax_liability() {
		return income_tax_liability;
	}
	public void setIncome_tax_liability(String income_tax_liability) {
		this.income_tax_liability = income_tax_liability;
	}
	public String getPrevious_residents_region() {
		return previous_residents_region;
	}
	public void setPrevious_residents_region(String previous_residents_region) {
		this.previous_residents_region = previous_residents_region;
	}
	public String getPrevious_residents_state() {
		return previous_residents_state;
	}
	public void setPrevious_residents_state(String previous_residents_state) {
		this.previous_residents_state = previous_residents_state;
	}
	public String getHousehold_with_family() {
		return household_with_family;
	}
	public void setHousehold_with_family(String household_with_family) {
		this.household_with_family = household_with_family;
	}
	public String getHousehold_simple() {
		return household_simple;
	}
	public void setHousehold_simple(String household_simple) {
		this.household_simple = household_simple;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getMsa_change() {
		return msa_change;
	}
	public void setMsa_change(String msa_change) {
		this.msa_change = msa_change;
	}
	public String getReg_change() {
		return reg_change;
	}
	public void setReg_change(String reg_change) {
		this.reg_change = reg_change;
	}
	public String getWithin_reg_change() {
		return within_reg_change;
	}
	public void setWithin_reg_change(String within_reg_change) {
		this.within_reg_change = within_reg_change;
	}
	public String getLived_here() {
		return lived_here;
	}
	public void setLived_here(String lived_here) {
		this.lived_here = lived_here;
	}
	public String getMigration_prev_res_in_sunbelt() {
		return migration_prev_res_in_sunbelt;
	}
	public void setMigration_prev_res_in_sunbelt(String migration_prev_res_in_sunbelt) {
		this.migration_prev_res_in_sunbelt = migration_prev_res_in_sunbelt;
	}
	public String getNum_persons_worked_for_employer() {
		return num_persons_worked_for_employer;
	}
	public void setNum_persons_worked_for_employer(String num_persons_worked_for_employer) {
		this.num_persons_worked_for_employer = num_persons_worked_for_employer;
	}
	public String getFamily_members_under118() {
		return family_members_under118;
	}
	public void setFamily_members_under118(String family_members_under118) {
		this.family_members_under118 = family_members_under118;
	}
	public String getFather_birth_country() {
		return father_birth_country;
	}
	public void setFather_birth_country(String father_birth_country) {
		this.father_birth_country = father_birth_country;
	}
	public String getMother_birth_country() {
		return mother_birth_country;
	}
	public void setMother_birth_country(String mother_birth_country) {
		this.mother_birth_country = mother_birth_country;
	}
	public String getBirth_country() {
		return birth_country;
	}
	public void setBirth_country(String birth_country) {
		this.birth_country = birth_country;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getOwn_business_or_self_employed() {
		return own_business_or_self_employed;
	}
	public void setOwn_business_or_self_employed(String own_business_or_self_employed) {
		this.own_business_or_self_employed = own_business_or_self_employed;
	}
	public String getFill_questionnaire_for_veteran_admin() {
		return fill_questionnaire_for_veteran_admin;
	}
	public void setFill_questionnaire_for_veteran_admin(String fill_questionnaire_for_veteran_admin) {
		this.fill_questionnaire_for_veteran_admin = fill_questionnaire_for_veteran_admin;
	}
	public String getVeterans_benefits() {
		return veterans_benefits;
	}
	public void setVeterans_benefits(String veterans_benefits) {
		this.veterans_benefits = veterans_benefits;
	}
	public String getWeeks_worked_in_year() {
		return weeks_worked_in_year;
	}
	public void setWeeks_worked_in_year(String weeks_worked_in_year) {
		this.weeks_worked_in_year = weeks_worked_in_year;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSalary_range() {
		return salary_range;
	}
	public void setSalary_range(String salary_range) {
		this.salary_range = salary_range;
	}
    
}
