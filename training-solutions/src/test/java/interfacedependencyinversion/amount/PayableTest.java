package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount(){
        Payable amount=new Amount();
        assertEquals(100,amount.getPayableAmount(100));
    }

    @Test
    void testCash(){
        Payable cash=new Cash();
        assertEquals(150,cash.getPayableAmount(152));
        assertEquals(355,cash.getPayableAmount(356));
        assertEquals(560,cash.getPayableAmount(558));
    }

    @Test
    void testBankAtm(){
        Payable atm=new BankAtm();
        assertEquals(1000,atm.getPayableAmount(152));
        assertEquals(4000,atm.getPayableAmount(3056));
        assertEquals(6000,atm.getPayableAmount(5860));
    }
}