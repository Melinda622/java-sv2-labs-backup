package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {

        StringBuilder sb = new StringBuilder();
        String[] a = new String[3];
        for (int i = 0; i < billItems.size(); i++) {
            a = billItems.get(i).split(";");
            int product = Integer.parseInt(a[2]) * Integer.parseInt(a[1]);
            //sb.delete(0,sb.length());
            sb.append(a[0]).append(", ").append(a[2]).append(" * ").append(a[1]).append(" = ").append(product).append(" Ft").append("\n");
        }
        return sb.toString();
    }
}
