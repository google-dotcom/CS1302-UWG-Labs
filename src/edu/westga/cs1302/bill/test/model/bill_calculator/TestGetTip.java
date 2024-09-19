package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTip {

	@Test
	void testGetTipValid() {
		Bill bill = new Bill();
		BillItem item = new BillItem("1", 5);
		BillItem item2 = new BillItem("2", 2);
		BillItem item3 = new BillItem("3", 1);	

		bill.addItem(item);
		bill.addItem(item2);
		bill.addItem(item3);

		assertEquals(1.6, BillCalculator.getTip(bill.getItems()));
	}

}
