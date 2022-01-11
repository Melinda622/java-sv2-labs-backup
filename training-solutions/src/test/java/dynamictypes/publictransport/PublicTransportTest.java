package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    PublicVehicle publicVehicle1=new Bus(8,3,"Ikarus");
    PublicVehicle publicVehicle2=new Tram(61,8,2);
    PublicVehicle publicVehicle3=new Metro(3,10,20);

    @Test
    void testAddVehicle(){
        PublicTransport publicTransport=new PublicTransport();

        publicTransport.addVehicle(publicVehicle1);
        publicTransport.addVehicle(publicVehicle2);
        publicTransport.addVehicle(publicVehicle3);

        assertEquals(3,publicTransport.getVehicles().size());
    }

}