package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {

        if (dnsEntries.size() == 0) {
            dnsEntries.add(new DnsEntry(hostName, hostIp));
        } else {
            for (DnsEntry actual : dnsEntries) {
                if (actual.name.equals(hostName) || actual.IpAddress.equals(hostIp)) {
                    throw new IllegalArgumentException("Already exists");
                }
            }
            dnsEntries.add(new DnsEntry(hostName, hostIp));
        }
    }

    public void removeEntryByName(String hostName) {
        List<DnsEntry> toBeRemoved = new ArrayList<>();

        for (DnsEntry actual : dnsEntries) {
            if (actual.name.equals(hostName)) {
                toBeRemoved.add(actual);
            }
        }
        dnsEntries.removeAll(toBeRemoved);
    }

    public void removeEntryByIp(String hostIp) {
        List<DnsEntry> toBeRemoved = new ArrayList<>();

        for (DnsEntry actual : dnsEntries) {
            if (actual.IpAddress.equals(hostIp)) {
                toBeRemoved.add(actual);
            }
        }
        dnsEntries.removeAll(toBeRemoved);
    }

    public String getIpByName(String hostName) {
        String result = "";
        for (DnsEntry actual : dnsEntries) {
            if (actual.name.equals(hostName)) {
                result = actual.IpAddress;
            }
        }
        if (result.isBlank()) {
            throw new IllegalArgumentException("Element not found");
        }
        return result;
    }

    public String getNameByIp(String hostIp) {
        String result = "";
        for (DnsEntry actual : dnsEntries) {
            if (actual.IpAddress.equals(hostIp)) {
                result = actual.name;
            }
        }
        if (result.isBlank()) {
            throw new IllegalArgumentException("Element not found");
        }
        return result;
    }

    public static class DnsEntry {
        private String name;
        private String IpAddress;

        public DnsEntry(String name, String ipAddress) {
            this.name = name;
            IpAddress = ipAddress;
        }
    }
}
