package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTax {

	@Test
	void testGetTaxValid() {
		Bill bill = new Bill();
		BillItem item = new BillItem("1", 10);
		BillItem item2 = new BillItem("2", 20);
		BillItem item3 = new BillItem("3", 30);	

		bill.addItem(item);
		bill.addItem(item2);
		bill.addItem(item3);
	
		assertEquals(6.0, BillCalculator.getTax(bill.getItems()));
	}

}
