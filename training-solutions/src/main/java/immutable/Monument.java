package immutable;

import java.time.LocalDate;

public class Monument {

    private final String name;
    private final String address;
    private final LocalDate dateOfRegistry;
    private final String registryNumber;

    public Monument(String name, String address, LocalDate dateOfRegistry, String registryNumber) {
        if(isEmpty(name,address,dateOfRegistry,registryNumber)==false){
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }else{
            this.name=name;
            this.address = address;
            this.dateOfRegistry = dateOfRegistry;
            this.registryNumber = registryNumber;
        }
    }

    private boolean isEmpty(String name,String address, LocalDate yearOfRegistration, String registryNumber){
        if(name=="   "||name==null) {
            return false;
        }else if(address==""||address==null){
            return false;
        }else if(yearOfRegistration==null){
            return false;
        }else if(registryNumber=="   "||registryNumber==null){
            return false;
        }else{
            return true;
        }
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public String getName() {
        return name;
    }
}
