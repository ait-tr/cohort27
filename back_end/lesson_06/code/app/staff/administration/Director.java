package app.staff.administration;

import app.staff.specialists.Secretary;

public class Director {

    private ProductionChief productionChief;
    private SalesChief salesChief;
    private Secretary secretary;

    public void manageCompany() {
        secretary.work();
        productionChief.giveOrders();
        salesChief.giveOrders();
    }

    public ProductionChief getProductionChief() {
        return productionChief;
    }

    public void setProductionChief(ProductionChief productionChief) {
        this.productionChief = productionChief;
    }

    public SalesChief getSalesChief() {
        return salesChief;
    }

    public void setSalesChief(SalesChief salesChief) {
        this.salesChief = salesChief;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
}