package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetSubtotal {

	@Test
	void testGetSubtotalValid() {
		Bill bill = new Bill();
		BillItem item = new BillItem("1", 5);
		BillItem item2 = new BillItem("2", 10);	
		bill.addItem(item);
		bill.addItem(item2);
		assertEquals(15.0, BillCalculator.getSubTotal(bill.getItems()));
	}

}
