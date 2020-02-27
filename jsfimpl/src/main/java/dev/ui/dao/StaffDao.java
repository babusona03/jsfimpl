package dev.ui.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dev.ui.entity.Staff;
import dev.ui.service.StaffService;

@Named
@RequestScoped
public class StaffDao {
	@Inject
	private Staff staff;
	private List<Staff> staffList;
	@Inject
	private StaffService staffService;
	
	public StaffDao() {
		super();		
		this.setStaffList(null);
	}
	public Staff getStaff() {		
		return staff;
	}	
	public void setStaff(Staff staff) {		
		this.staff = staff;
	}
	public StaffService getStaffService() {
		return staffService;
	}
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	public List<Staff> getStaffList() {
		return staffList;
	}
	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}
	@PostConstruct
	public void init() {
		staff = new Staff();
	}
	public String readSingleStaff(Staff staff) {
		this.setStaff(staff);
		System.out.println("SINGLE STAFF VALUE:"+this.getStaff().getStaffId()+" "+this.getStaff().getStaffName()+" "+this.getStaff().getDesignation()+" "+this.getStaff().getDoj()+" "+this.getStaff().getModDate());		
		return "Read";
	}

	public void createStaff() {
		System.out.println("Staff Name : "+this.getStaff().getStaffName());
		System.out.println("Staff designation: "+this.getStaff().getDesignation());
		this.getStaff().setStaffId(7);//dummy set value;to satisfy JPA as Pk cant be null
		this.getStaffService().createStaff(this.getStaff());
		this.setStaff(null);
		
	}	
	public List<Staff> readStaff() {
		//System.out.println("Staff Name : "+this.getStaff().getStaffName());
		//System.out.println("Staff designation: "+this.getStaff().getDesignation());
		this.setStaffList(this.getStaffService().getEmployees());
		//this.getStaffService().createStaff(this.getStaff());
		return this.getStaffList();
	}
	
	public String updateStaff() {
		//this.setStaff(staff);
		System.out.println("NEW STAFF VALUE:"+this.getStaff().getStaffId()+" "+this.getStaff().getStaffName()+" "+this.getStaff().getDesignation()+" "+this.getStaff().getDoj()+" "+this.getStaff().getModDate());
		//this.getStaff().setStaffId(this.getStaff().getStaffId());//dummy set value;to satisfy JPA as Pk cant be null
		this.getStaffService().updateStaff(this.getStaff());
		this.setStaff(null);
		return "JpaHome";
	}
	public String prepEdit(Staff staff) {
		this.setStaff(staff);//creating this as for each row
		System.out.println("OLD STAFF VALUE:"+this.getStaff().getStaffId()+" "+this.getStaff().getStaffName()+" "+this.getStaff().getDesignation()+" "+this.getStaff().getDoj()+" "+this.getStaff().getModDate());
		return "Edit";//forwarding to the Edit Confirmation page that will be populated with the corresponding row data
	}
	public String prepDelete(Staff staff) {
		this.setStaff(staff);
		System.out.println("TO be deleted STAFF VALUE:"+this.getStaff().getStaffId()+" "+this.getStaff().getStaffName()+" "+this.getStaff().getDesignation()+" "+this.getStaff().getDoj()+" "+this.getStaff().getModDate());
		return "Delete";//forwarding to the Delete Confirmation page that will be populated with the corresponding row data
	}
	public String deleteStaff() {
		System.out.println("DELETING  STAFF VALUE:"+this.getStaff().getStaffId()+" "+this.getStaff().getStaffName()+" "+this.getStaff().getDesignation()+" "+this.getStaff().getDoj()+" "+this.getStaff().getModDate());
		Staff staff = this.getStaff();
		this.getStaffService().removeStaff(staff);
		this.setStaff(null);
		return "JpaHome";
	}
	
	public List<Staff> readStaffOrderById(){
		return this.getStaffService().getStaffOrderById();
	}
}
