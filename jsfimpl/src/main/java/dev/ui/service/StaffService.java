package dev.ui.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import dev.ui.entity.Staff;

@Transactional
@RequestScoped
public class StaffService {
	@PersistenceContext
	EntityManager entityManager;
	
	public Staff createStaff(Staff staff) {
		entityManager.persist(staff);
		return staff;
	}
	
	public Staff updateStaff(Staff staff) {
		entityManager.merge(staff);
		return staff;
	}
	
	public Staff findStaffById(Integer id) {
		return entityManager.find(Staff.class, id);
	}
	public List<Staff> getStaffOrderById(){
		return entityManager.createNamedQuery(Staff.STAFFLIST_ORDER_BY_ID,Staff.class).getResultList();
	}
	public List<Staff> getEmployees(){
		return entityManager.createQuery("select e from Staff e", Staff.class).getResultList();
	}
	
	public Staff removeStaff(Staff staff) {
		entityManager.remove(entityManager.contains(staff) ? staff : entityManager.merge(staff));//once the entity is thrown to jsf, it gets detached. so needs to be merged back to the persistence context 
		return staff;
	}
	
}
