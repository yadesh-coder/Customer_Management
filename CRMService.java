package com.wipro.crm.services;
import java.util.*;
import com.wipro.crm.entity.Customer;
import com.wipro.crm.entity.Interaction;
import com.wipro.crm.util.*;
public class CRMService {
	private ArrayList<Customer> customers;
	private ArrayList<Interaction> interactions;
	
	public CRMService(ArrayList<Customer> customers,ArrayList<Interaction> interactions){
		this.customers=customers;
		this.interactions=interactions;
	}
	public void addCustomer(Customer customer)throws CustomerExistsException{
		for(Customer c:customers){
			if(c.getCustomerId().equals(customer.getCustomerId())){
				throw new CustomerExistsException(customer.getCustomerId()+"already exists");
			}
		}
		customers.add(customer);
		}
		public Customer searchCustomer(String customerId) throws CustomerNotFoundException{
			for(Customer c:customers){
				if(c.getCustomerId().equals(customerId)){
					return c;
				}
			}
			throw new CustomerNotFoundException(customerId+"not found");
	}
		public void updateCustomerStatus(String  customer, String newStatus) throws  CustomerNotFoundException {
			Customer c=searchCustomer(customer);
			c.setStatus(newStatus);
		}
		public void logInteraction(String customerId, String date, String notes)throws InteractionOperationException{
			if(notes==null){
				throw new InteractionOperationException("Notes cannot be empty");
			}
			try {
				Customer c=searchCustomer(customerId);
				String InteractionId="I"+(interactions.size()+1);
				interactions.add(new Interaction(InteractionId,c.getCustomerId(),date,notes));
			}
			catch(CustomerNotFoundException e){
				throw new InteractionOperationException("CustomerId is invalid");
			}
		}
		public ArrayList<Interaction> getCustomerInteractions(String customerId){
			ArrayList<Interaction> I=new ArrayList<>();
			for(Interaction i:interactions){
				if(i.getCustomerId().equals(customerId)){
					I.add(i);				}
			}
			return I;
		}
		public void deleteCustomer(String customerId) throws CustomerNotFoundException{
			searchCustomer(customerId);
			ArrayList<Interaction> I=new ArrayList<>();
			for(Interaction i:interactions){
				if(!i.getCustomerId().equals(customerId)){
					I.add(i);
				}
			}
			interactions=I;
		}
		public void displayAllCustomers(){
			for(Customer c:customers) {
				System.out.println("ID: "+c.getCustomerId()+" | NAME: "+c.getName()+" | EMAIL: "+c.getEmail()+" | STATUS: "+c.getStatus());
			}
		}
}
