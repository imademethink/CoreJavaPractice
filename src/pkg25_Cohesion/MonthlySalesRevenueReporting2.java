package pkg25_Cohesion;

// hign cohesion

class DataProcessing{
    public void DataCollectionFromDatabase() {
        System.out.println("DataCollectionFromDatabase");
    }

    public void DataCollectionFromExcel() {
        System.out.println("DataCollectionFromExcel");
    }
}

class TransactionProcessing{
    public void ProcessPaymentSettlement() {
        System.out.println("ProcessPaymentSettlement");
    }

    public void ProcessRefund() {
        System.out.println("ProcessRefund");
    }

    public void ProcessReturnItems() {
        System.out.println("ProcessReturnItems");
    }
}

public class MonthlySalesRevenueReporting2 {
    public static void main(String[] args) {

        DataProcessing dp = new DataProcessing();
        dp.DataCollectionFromExcel();
        dp.DataCollectionFromDatabase();

        TransactionProcessing tp = new TransactionProcessing();
        tp.ProcessPaymentSettlement();
        tp.ProcessRefund();
        tp.ProcessReturnItems();

        MonthlySalesRevenueReporting2 ecommerce = new MonthlySalesRevenueReporting2();
        ecommerce.ProcessTax();
        ecommerce.GraphicalReporting();
    }

    private void GraphicalReporting() {
        System.out.println("GraphicalReporting");
    }

    private void ProcessTax() {
        System.out.println("ProcessTax");
    }



}
