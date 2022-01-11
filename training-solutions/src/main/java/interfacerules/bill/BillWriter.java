package interfacerules.bill;

import java.util.List;

public interface BillWriter {

    public abstract String writeBill(List<String> billItems);
}
