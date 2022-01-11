package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {

        StringBuilder sb = new StringBuilder();
        String[] a = new String[3];
        for (int i = 0; i < billItems.size(); i++) {
            a = billItems.get(i).split(";");
            int product = Integer.parseInt(a[2]) * Integer.parseInt(a[1]);
            sb.append(a[0]).append("; ").append("darabszám: ").append(a[2]).append(", ").append("egységár: ").append(a[1]).append(", ").append("összesen: ").append(product).append(" Ft").append("\n");
        }
        return sb.toString();
    }
}
