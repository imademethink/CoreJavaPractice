package pkg25_Cohesion;

// low cohesion

public class MonthlySalesRevenueReporting {
    public static void main(String[] args) {

        MonthlySalesRevenueReporting ecommerce = new MonthlySalesRevenueReporting();

        ecommerce.DataCollectionFromExcel();
        ecommerce.DataCollectionFromDatabase();
        ecommerce.ProcessPaymentSettlement();
        ecommerce.ProcessRefund();
        ecommerce.ProcessReturnItems();
        ecommerce.ProcessTax();
        ecommerce.GraphicalReporting();
    }

    private void GraphicalReporting() {
        System.out.println("GraphicalReporting");
    }

    private void ProcessTax() {
        System.out.println("ProcessTax");
    }

    private void ProcessReturnItems() {
        System.out.println("ProcessReturnItems");
    }

    private void ProcessRefund() {
        System.out.println("ProcessRefund");
    }

    private void ProcessPaymentSettlement() {
        System.out.println("ProcessPaymentSettlement");
    }

    private void DataCollectionFromDatabase() {
        System.out.println("DataCollectionFromDatabase");
    }

    private void DataCollectionFromExcel() {
        System.out.println("DataCollectionFromExcel");
    }

}
