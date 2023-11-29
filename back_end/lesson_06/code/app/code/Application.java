package app.code;

import app.staff.administration.Director;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

//        MachineOperator machineOperator = new MachineOperator();
//        Storekeeper storekeeper = new Storekeeper();
//
//        Merchandiser merchandiser = new Merchandiser();
//        SalesManager salesManager = new SalesManager();
//
//        Secretary secretary = new Secretary();
//
//        ProductionChief productionChief = new ProductionChief();
//        productionChief.setMachineOperator(machineOperator);
//        productionChief.setStorekeeper(storekeeper);
//
//        SalesChief salesChief = new SalesChief();
//        salesChief.setMerchandiser(merchandiser);
//        salesChief.setSalesManager(salesManager);
//
//        Director director = new Director();
//        director.setSecretary(secretary);
//        director.setSalesChief(salesChief);
//        director.setProductionChief(productionChief);
//
//        director.manageCompany();

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Director director = (Director) context.getBean("dir");
        Director director = context.getBean(Director.class);
        director.manageCompany();
    }
}