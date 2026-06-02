package com.wipro.crm.main;

import java.util.ArrayList;
import com.wipro.crm.entity.Customer;
import com.wipro.crm.entity.Interaction;
import com.wipro.crm.services.CRMService;
import com.wipro.crm.util.CustomerExistsException;
import com.wipro.crm.util.CustomerNotFoundException;
import com.wipro.crm.util.InteractionOperationException;

public class Main{
	public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Interaction> interactions=new ArrayList<>();
        customers.add(new Customer("C001","Arjun","arjun@mail.com","NEW"));
        customers.add(new Customer("C002","Megha","megha@mail.com","IN_PROGRESS"));
        CRMService service=new CRMService(customers,interactions);
        try{
            System.out.println("Adding Customer");
            service.addCustomer(new Customer("C003","Rahul","rahul@mail.com","NEW"));
            System.out.println("\nUpdating Status");
            service.updateCustomerStatus("C002","CLOSED");
            System.out.println("\nLogging Interaction");
            service.logInteraction("C001","2025-07-15","Discussed pricing options.");
            System.out.println("\nCustomer Interactions(C001)");
            for(Interaction i:service.getCustomerInteractions("C001")){
                System.out.println(i.getNotes());
            }
            System.out.println("\nAll Customers");
            service.displayAllCustomers();
            System.out.println("\nDeleting Customer C003");
            service.deleteCustomer("C003");
        } catch(CustomerExistsException|CustomerNotFoundException |InteractionOperationException e){
            System.out.println(e);
        } catch(Exception e){
            System.out.println("Unexpected Error: "+e);
        }
    }
}

